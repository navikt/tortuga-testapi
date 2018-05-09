package no.nav.opptjening.api.internal;

import no.nav.opptjening.api.beregnetskatt.BeregnetSkattService;
import no.nav.opptjening.api.beregnetskatt.domain.BeregnetSkatt;
import no.nav.opptjening.api.hendelser.HendelseService;
import no.nav.opptjening.api.hendelser.domain.Hendelse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/")
public class ScaffoldEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(ScaffoldEndpoint.class);

    private final HendelseService hendelseSerice;
    private final BeregnetSkattService beregnetSkattService;

    public ScaffoldEndpoint(HendelseService hendelseSerice, BeregnetSkattService beregnetSkattService) {
        this.hendelseSerice = hendelseSerice;
        this.beregnetSkattService = beregnetSkattService;
    }

    @RequestMapping(method = {RequestMethod.POST}, value="/createHendelser/{count}")
    public void createHendelser(@PathVariable int count) {
        LOG.info("Lager {} hendelser og beregnet skatt", count);

        List<Hendelse> hendelser = new ArrayList<>(count);
        List<BeregnetSkatt> beregnetSkattListe = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            String fnr = getRandomFnr();
            Hendelse hendelse = new Hendelse(fnr, "2017");
            BeregnetSkatt beregnetSkatt = getRandomBeregnetSkatt(fnr, "2017");

            hendelser.add(hendelse);
            beregnetSkattListe.add(beregnetSkatt);
        }

        beregnetSkattService.lagreBeregnetSkatt(beregnetSkattListe);
        hendelseSerice.lagreHendelser(hendelser);
    }

    @RequestMapping(method = {RequestMethod.POST}, value="/createHendelse/{inntektsaar}/{fnr}")
    public void createHendelser(@PathVariable String inntektsaar, @PathVariable String fnr) {
        LOG.info("Lager hendelse og beregnet skatt for {} i {}", fnr, inntektsaar);

        Hendelse hendelse = new Hendelse(fnr, inntektsaar);
        BeregnetSkatt beregnetSkatt = getRandomBeregnetSkatt(fnr, inntektsaar);

        beregnetSkattService.lagreBeregnetSkatt(beregnetSkatt);
        hendelseSerice.lagreHendelse(hendelse);
    }

    private BeregnetSkatt getRandomBeregnetSkatt(String fnr, String år) {
        return new BeregnetSkatt(new BeregnetSkatt.PersonInntekt(fnr, år), getRandomInntekt(), getRandomInntekt(),
                getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(),
                getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInt(10, 101),
                getRandomInt(1, 12), getRandomInt(1, 12), "1E", getRandomInntekt(), getRandomInntekt(),
                getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(),
                getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt(),
                getRandomInntekt(), getRandomInntekt(), getRandomInntekt(), getRandomInntekt());
    }

    private int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private int getRandomInntekt() {
        return getRandomInt(1000, 1000000);
    }

    private String zeroPad(int n, int k) {
        return String.format("%0" + n + "d", k);
    }

    private String getRandomFnr() {
        StringBuilder sb = new StringBuilder();
        sb.append(zeroPad(2, getRandomInt(1, 31)));
        sb.append(zeroPad(2, getRandomInt(1, 12)));
        sb.append(zeroPad(2, getRandomInt(10, 99)));
        sb.append(zeroPad(5, getRandomInt(10000, 99999)));
        return sb.toString();
    }
}
