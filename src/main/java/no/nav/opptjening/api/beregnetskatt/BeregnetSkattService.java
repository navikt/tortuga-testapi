package no.nav.opptjening.api.beregnetskatt;

import no.nav.opptjening.api.ApiException;
import no.nav.opptjening.api.beregnetskatt.domain.BeregnetSkatt;
import no.nav.opptjening.api.beregnetskatt.repository.BeregnetSkattRepository;
import no.nav.opptjening.api.hendelser.HendelseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class BeregnetSkattService {

    private static final Logger LOG = LoggerFactory.getLogger(HendelseService.class);

    private BeregnetSkattRepository repository;

    public BeregnetSkattService(BeregnetSkattRepository repository) {
        this.repository = repository;
    }

    public void lagreBeregnetSkatt(Iterable<BeregnetSkatt> beregnetSkatt) {
        repository.save(beregnetSkatt);
    }

    BeregnetSkattDto hentBeregnetSkatt(String fnr, String inntektsaar) {
        int year = Integer.valueOf(inntektsaar);

        if (year < 2000 || year > 2100) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "BSA-007", "Inntektsår har ikke gyldig format");
        }

        if (fnr.length() != 11) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "BSA-008", "Personidentifikator har ikke gyldig format");
        }

        if (Integer.valueOf(inntektsaar) > Year.now().getValue()) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "BSA-005", "Det forespurte inntektsåret er ikke støttet");
        }

        LOG.info("Henter beregnet skatt ({},{})", fnr, inntektsaar);

        BeregnetSkatt beregnetSkatt = repository.findOne(new BeregnetSkatt.PersonInntekt(fnr, inntektsaar));

        if (beregnetSkatt == null) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "BSA-006", "Fant ikke Beregnet Skatt for gitt inntektsår og identifikator");
        }

        return new BeregnetSkattDto(beregnetSkatt.getIdentifikator(), beregnetSkatt.getInntektsaar(), beregnetSkatt.getSumSaerfradrag(), beregnetSkatt.getSkjermingsfradrag(),
                beregnetSkatt.getFormuePrimaerbolig(), beregnetSkatt.getSamletGjeld(), beregnetSkatt.getPersoninntektLoenn(), beregnetSkatt.getPersoninntektPensjon(),
                beregnetSkatt.getPersoninntektFiskeFangstFamiliebarnehage(), beregnetSkatt.getPersoninntektNaering(), beregnetSkatt.getPersoninntektBarePensjonsdel(),
                beregnetSkatt.getPersoninntektBareSykedel(), beregnetSkatt.getSamletPensjon(), beregnetSkatt.getPensjonsgrad(), beregnetSkatt.getAntallMaanederPensjon(),
                beregnetSkatt.getTolvdeler(), beregnetSkatt.getSkatteklasse(), beregnetSkatt.getNettoformue(), beregnetSkatt.getNettoinntekt(), beregnetSkatt.getUtlignetSkatt(),
                beregnetSkatt.getGrunnlagTrinnskatt(), beregnetSkatt.getSvalbardGjeld(), beregnetSkatt.getSvalbardLoennLoennstrekkordningen(), beregnetSkatt.getSvalbardPensjonLoennstrekkordningen(),
                beregnetSkatt.getSvalbardPersoninntektNaering(), beregnetSkatt.getSvalbardLoennUtenTrygdeavgiftLoennstrekkordningen(),
                beregnetSkatt.getSvalbardSumAllePersoninntekter(), beregnetSkatt.getSvalbardNettoformue(), beregnetSkatt.getSvalbardNettoinntekt(),
                beregnetSkatt.getSvalbardUtlignetSkatt(), beregnetSkatt.getSvalbardUfoeretrygdLoennstrekkordningen(), beregnetSkatt.getGrunnlagTrinnskattUtenomPersoninntekt(),
                beregnetSkatt.getPersoninntektUfoeretrygd());
    }
}
