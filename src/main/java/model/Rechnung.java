package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rechnung {

    private final int id;
    private final String rechnungsnummer;
    private final String rechnungsdatum;
    private final int rechnungsbetrag;
    private final int kunde;

    public Rechnung(@JsonProperty("id") int id,
                    @JsonProperty("rechnungsnummer") String rechnungsnummer,
                    @JsonProperty("rechnungsdatum") String rechnungsdatum,
                    @JsonProperty("rechnungsbetrag") int rechnungsbetrag,
                    @JsonProperty("kunde") int kunde){
        this.id=id;
        this.rechnungsnummer=rechnungsnummer;
        this.rechnungsdatum=rechnungsdatum;
        this.rechnungsbetrag=rechnungsbetrag;
        this.kunde=kunde;

    }

    public int getId() {
        return id;
    }

    public String getRechnungsnummer() {
        return rechnungsnummer;
    }

    public String getRechnungsdatum() {
        return rechnungsdatum;
    }

    public int getRechnungsbetrag() {
        return rechnungsbetrag;
    }

    public int getKunde() {
        return kunde;
    }
}
