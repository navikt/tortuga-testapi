package no.nav.opptjening.api.beregnetskatt.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BEREGNET_SKATT")
public class BeregnetSkatt {

    @EmbeddedId
    private PersonInntekt pk;

    @Column(nullable = false)
    private final int sumSaerfradrag;
    @Column(nullable = false)
    private final int skjermingsfradrag;
    @Column(nullable = false)
    private final int formuePrimaerbolig;
    @Column(nullable = false)
    private final int samletGjeld;
    @Column(nullable = false)
    private final int personinntektLoenn;
    @Column(nullable = false)
    private final int personinntektPensjon;
    @Column(nullable = false)
    private final int personinntektFiskeFangstFamiliebarnehage;
    @Column(nullable = false)
    private final int personinntektNaering;
    @Column(nullable = false)
    private final int personinntektBarePensjonsdel;
    @Column(nullable = false)
    private final int personinntektBareSykedel;
    @Column(nullable = false)
    private final int samletPensjon;
    @Column(nullable = false)
    private final double pensjonsgrad;
    @Column(nullable = false)
    private final int antallMaanederPensjon;
    @Column(nullable = false)
    private final int tolvdeler;
    @Column(nullable = false)
    private final String skatteklasse;
    @Column(nullable = false)
    private final int nettoformue;
    @Column(nullable = false)
    private final int nettoinntekt;
    @Column(nullable = false)
    private final int utlignetSkatt;
    @Column(nullable = false)
    private final int grunnlagTrinnskatt;
    @Column(nullable = false)
    private final int svalbardGjeld;
    @Column(nullable = false)
    private final int svalbardLoennLoennstrekkordningen;
    @Column(nullable = false)
    private final int svalbardPensjonLoennstrekkordningen;
    @Column(nullable = false)
    private final int svalbardPersoninntektNaering;
    @Column(nullable = false)
    private final int svalbardLoennUtenTrygdeavgiftLoennstrekkordningen;
    @Column(nullable = false)
    private final int svalbardSumAllePersoninntekter;
    @Column(nullable = false)
    private final int svalbardNettoformue;
    @Column(nullable = false)
    private final int svalbardNettoinntekt;
    @Column(nullable = false)
    private final int svalbardUtlignetSkatt;
    @Column(nullable = false)
    private final int svalbardUfoeretrygdLoennstrekkordningen;
    @Column(nullable = false)
    private final int grunnlagTrinnskattUtenomPersoninntekt;
    @Column(nullable = false)
    private final int personinntektUfoeretrygd;


    protected BeregnetSkatt() {
        this.sumSaerfradrag = 0;
        this.skjermingsfradrag = 0;
        this.formuePrimaerbolig = 0;
        this.samletGjeld = 0;
        this.personinntektLoenn = 0;
        this.personinntektPensjon = 0;
        this.personinntektFiskeFangstFamiliebarnehage = 0;
        this.personinntektNaering = 0;
        this.personinntektBarePensjonsdel = 0;
        this.personinntektBareSykedel = 0;
        this.samletPensjon = 0;
        this.pensjonsgrad = 0;
        this.antallMaanederPensjon = 0;
        this.tolvdeler = 0;
        this.skatteklasse = "";
        this.nettoformue = 0;
        this.nettoinntekt = 0;
        this.utlignetSkatt = 0;
        this.grunnlagTrinnskatt = 0;
        this.svalbardGjeld = 0;
        this.svalbardLoennLoennstrekkordningen = 0;
        this.svalbardPensjonLoennstrekkordningen = 0;
        this.svalbardPersoninntektNaering = 0;
        this.svalbardLoennUtenTrygdeavgiftLoennstrekkordningen = 0;
        this.svalbardSumAllePersoninntekter = 0;
        this.svalbardNettoformue = 0;
        this.svalbardNettoinntekt = 0;
        this.svalbardUtlignetSkatt = 0;
        this.svalbardUfoeretrygdLoennstrekkordningen = 0;
        this.grunnlagTrinnskattUtenomPersoninntekt = 0;
        this.personinntektUfoeretrygd = 0;
    }

    public BeregnetSkatt(PersonInntekt pk, int sumSaerfradrag, int skjermingsfradrag, int formuePrimaerbolig, int samletGjeld, int personinntektLoenn, int personinntektPensjon, int personinntektFiskeFangstFamiliebarnehage, int personinntektNaering, int personinntektBarePensjonsdel, int personinntektBareSykedel, int samletPensjon, int pensjonsgrad, int antallMaanederPensjon, int tolvdeler, String skatteklasse, int nettoformue, int nettoinntekt, int utlignetSkatt, int grunnlagTrinnskatt, int svalbardGjeld, int svalbardLoennLoennstrekkordningen, int svalbardPensjonLoennstrekkordningen, int svalbardPersoninntektNaering, int svalbardLoennUtenTrygdeavgiftLoennstrekkordningen, int svalbardSumAllePersoninntekter, int svalbardNettoformue, int svalbardNettoinntekt, int svalbardUtlignetSkatt, int svalbardUfoeretrygdLoennstrekkordningen, int grunnlagTrinnskattUtenomPersoninntekt, int personinntektUfoeretrygd) {
        this.pk = pk;
        this.sumSaerfradrag = sumSaerfradrag;
        this.skjermingsfradrag = skjermingsfradrag;
        this.formuePrimaerbolig = formuePrimaerbolig;
        this.samletGjeld = samletGjeld;
        this.personinntektLoenn = personinntektLoenn;
        this.personinntektPensjon = personinntektPensjon;
        this.personinntektFiskeFangstFamiliebarnehage = personinntektFiskeFangstFamiliebarnehage;
        this.personinntektNaering = personinntektNaering;
        this.personinntektBarePensjonsdel = personinntektBarePensjonsdel;
        this.personinntektBareSykedel = personinntektBareSykedel;
        this.samletPensjon = samletPensjon;
        this.pensjonsgrad = pensjonsgrad;
        this.antallMaanederPensjon = antallMaanederPensjon;
        this.tolvdeler = tolvdeler;
        this.skatteklasse = skatteklasse;
        this.nettoformue = nettoformue;
        this.nettoinntekt = nettoinntekt;
        this.utlignetSkatt = utlignetSkatt;
        this.grunnlagTrinnskatt = grunnlagTrinnskatt;
        this.svalbardGjeld = svalbardGjeld;
        this.svalbardLoennLoennstrekkordningen = svalbardLoennLoennstrekkordningen;
        this.svalbardPensjonLoennstrekkordningen = svalbardPensjonLoennstrekkordningen;
        this.svalbardPersoninntektNaering = svalbardPersoninntektNaering;
        this.svalbardLoennUtenTrygdeavgiftLoennstrekkordningen = svalbardLoennUtenTrygdeavgiftLoennstrekkordningen;
        this.svalbardSumAllePersoninntekter = svalbardSumAllePersoninntekter;
        this.svalbardNettoformue = svalbardNettoformue;
        this.svalbardNettoinntekt = svalbardNettoinntekt;
        this.svalbardUtlignetSkatt = svalbardUtlignetSkatt;
        this.svalbardUfoeretrygdLoennstrekkordningen = svalbardUfoeretrygdLoennstrekkordningen;
        this.grunnlagTrinnskattUtenomPersoninntekt = grunnlagTrinnskattUtenomPersoninntekt;
        this.personinntektUfoeretrygd = personinntektUfoeretrygd;
    }

    public String getIdentifikator() {
        return pk.identifikator;
    }

    public String getInntektsaar() {
        return pk.inntektsaar;
    }

    public int getSumSaerfradrag() {
        return sumSaerfradrag;
    }

    public int getSkjermingsfradrag() {
        return skjermingsfradrag;
    }

    public int getFormuePrimaerbolig() {
        return formuePrimaerbolig;
    }

    public int getSamletGjeld() {
        return samletGjeld;
    }

    public int getPersoninntektLoenn() {
        return personinntektLoenn;
    }

    public int getPersoninntektPensjon() {
        return personinntektPensjon;
    }

    public int getPersoninntektFiskeFangstFamiliebarnehage() {
        return personinntektFiskeFangstFamiliebarnehage;
    }

    public int getPersoninntektNaering() {
        return personinntektNaering;
    }

    public int getPersoninntektBarePensjonsdel() {
        return personinntektBarePensjonsdel;
    }

    public int getPersoninntektBareSykedel() {
        return personinntektBareSykedel;
    }

    public int getSamletPensjon() {
        return samletPensjon;
    }

    public double getPensjonsgrad() {
        return pensjonsgrad;
    }

    public int getAntallMaanederPensjon() {
        return antallMaanederPensjon;
    }

    public int getTolvdeler() {
        return tolvdeler;
    }

    public String getSkatteklasse() {
        return skatteklasse;
    }

    public int getNettoformue() {
        return nettoformue;
    }

    public int getNettoinntekt() {
        return nettoinntekt;
    }

    public int getUtlignetSkatt() {
        return utlignetSkatt;
    }

    public int getGrunnlagTrinnskatt() {
        return grunnlagTrinnskatt;
    }

    public int getSvalbardGjeld() {
        return svalbardGjeld;
    }

    public int getSvalbardLoennLoennstrekkordningen() {
        return svalbardLoennLoennstrekkordningen;
    }

    public int getSvalbardPensjonLoennstrekkordningen() {
        return svalbardPensjonLoennstrekkordningen;
    }

    public int getSvalbardPersoninntektNaering() {
        return svalbardPersoninntektNaering;
    }

    public int getSvalbardLoennUtenTrygdeavgiftLoennstrekkordningen() {
        return svalbardLoennUtenTrygdeavgiftLoennstrekkordningen;
    }

    public int getSvalbardSumAllePersoninntekter() {
        return svalbardSumAllePersoninntekter;
    }

    public int getSvalbardNettoformue() {
        return svalbardNettoformue;
    }

    public int getSvalbardNettoinntekt() {
        return svalbardNettoinntekt;
    }

    public int getSvalbardUtlignetSkatt() {
        return svalbardUtlignetSkatt;
    }

    public int getSvalbardUfoeretrygdLoennstrekkordningen() {
        return svalbardUfoeretrygdLoennstrekkordningen;
    }

    public int getGrunnlagTrinnskattUtenomPersoninntekt() {
        return grunnlagTrinnskattUtenomPersoninntekt;
    }

    public int getPersoninntektUfoeretrygd() {
        return personinntektUfoeretrygd;
    }

    public String toString() {
        return String.format(
                "[identifikator=%d, inntektsaar=%s]",
                pk.identifikator, pk.inntektsaar);
    }

    @Embeddable
    public static class PersonInntekt implements Serializable {
        @Column(nullable = false)
        private String identifikator;

        @Column(nullable = false)
        private String inntektsaar;

        public PersonInntekt() {
        }

        public PersonInntekt(String identifikator, String inntektsaar) {
            this.identifikator = identifikator;
            this.inntektsaar = inntektsaar;
        }

        public String getIdentifikator() {
            return identifikator;
        }

        public String getInntektsaar() {
            return inntektsaar;
        }
    }
}
