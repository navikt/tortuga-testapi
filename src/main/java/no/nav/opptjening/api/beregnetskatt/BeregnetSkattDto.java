package no.nav.opptjening.api.beregnetskatt;

class BeregnetSkattDto {

    private final String personidentifikator;
    private final String inntektsaar;
    private final int sumSaerfradrag;
    private final int skjermingsfradrag;
    private final int formuePrimaerbolig;
    private final int samletGjeld;
    private final int personinntektLoenn;
    private final int personinntektPensjon;
    private final int personinntektFiskeFangstFamiliebarnehage;
    private final int personinntektNaering;
    private final int personinntektBarePensjonsdel;
    private final int personinntektBareSykedel;
    private final int samletPensjon;
    private final double pensjonsgrad;
    private final int antallMaanederPensjon;
    private final int tolvdeler;
    private final String skatteklasse;
    private final int nettoformue;
    private final int nettoinntekt;
    private final int utlignetSkatt;
    private final int grunnlagTrinnskatt;
    private final int svalbardGjeld;
    private final int svalbardLoennLoennstrekkordningen;
    private final int svalbardPensjonLoennstrekkordningen;
    private final int svalbardPersoninntektNaering;
    private final int svalbardLoennUtenTrygdeavgiftLoennstrekkordningen;
    private final int svalbardSumAllePersoninntekter;
    private final int svalbardNettoformue;
    private final int svalbardNettoinntekt;
    private final int svalbardUtlignetSkatt;
    private final int svalbardUfoeretrygdLoennstrekkordningen;
    private final int grunnlagTrinnskattUtenomPersoninntekt;
    private final int personinntektUfoeretrygd;

    BeregnetSkattDto(String personidentifikator, String inntektsaar, int sumSaerfradrag, int skjermingsfradrag, int formuePrimaerbolig, int samletGjeld, int personinntektLoenn, int personinntektPensjon, int personinntektFiskeFangstFamiliebarnehage, int personinntektNaering, int personinntektBarePensjonsdel, int personinntektBareSykedel, int samletPensjon, double pensjonsgrad, int antallMaanederPensjon, int tolvdeler, String skatteklasse, int nettoformue, int nettoinntekt, int utlignetSkatt, int grunnlagTrinnskatt, int svalbardGjeld, int svalbardLoennLoennstrekkordningen, int svalbardPensjonLoennstrekkordningen, int svalbardPersoninntektNaering, int svalbardLoennUtenTrygdeavgiftLoennstrekkordningen, int svalbardSumAllePersoninntekter, int svalbardNettoformue, int svalbardNettoinntekt, int svalbardUtlignetSkatt, int svalbardUfoeretrygdLoennstrekkordningen, int grunnlagTrinnskattUtenomPersoninntekt, int personinntektUfoeretrygd) {
        this.personidentifikator = personidentifikator;
        this.inntektsaar = inntektsaar;
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

    public String getPersonidentifikator() {
        return personidentifikator;
    }

    public String getInntektsaar() {
        return inntektsaar;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        return sb.append("pid: ")
                .append(personidentifikator)
                .append(", inntektsAar: ")
                .append(inntektsaar)
                .append("]")
                .toString();
    }
}

