package no.nav.opptjening.api.beregnetskatt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ekstern/skatt/datasamarbeid/api/formueinntekt/beregnetskatt/{rettighetspakke}/{inntektsaar}/{personidentifikator}")
public class BeregnetSkatt {

    private BeregnetSkattService service;

    public BeregnetSkatt(BeregnetSkattService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public BeregnetSkattDto hentBeregnetSkatt(@PathVariable String rettighetspakke, @PathVariable String inntektsaar, @PathVariable String personidentifikator) {
        return service.hentBeregnetSkatt(personidentifikator, inntektsaar);
    }
}
