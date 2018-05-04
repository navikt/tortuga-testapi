package no.nav.opptjening.api.beregnetskatt.repository;

import no.nav.opptjening.api.beregnetskatt.domain.BeregnetSkatt;
import org.springframework.data.repository.CrudRepository;

public interface BeregnetSkattRepository extends CrudRepository<BeregnetSkatt, BeregnetSkatt.PersonInntekt> {

    BeregnetSkatt findOne(BeregnetSkatt.PersonInntekt pk);

}
