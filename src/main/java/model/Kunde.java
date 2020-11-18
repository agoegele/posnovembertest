package model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Kunde {
    private final long id;

    private final String vorname;
    private final String nachname;

    public Kunde(@JsonProperty("id") long id,
                 @JsonProperty("vorname") String vorname,
                 @JsonProperty("nachname") String nachname){
    this.id=id;
    this.vorname=vorname;
    this.nachname=nachname;
    }

    public long getid(){
        return id;
    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }

}


