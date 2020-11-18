package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;


public class Kunde {
    private final int id;
    private final String vorname;
    private final String nachname;
    private ArrayList<Integer> rechnungen = new ArrayList<Integer>();

    public Kunde(@JsonProperty("id") int id,
                 @JsonProperty("vorname") String vorname,
                 @JsonProperty("nachname") String nachname,
                 @JsonProperty("rechnungen") ArrayList rechnungen){
    this.id=id;
    this.vorname=vorname;
    this.nachname=nachname;
    this.rechnungen=rechnungen;

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
    public ArrayList<Integer> getRechnungen(){
        return rechnungen;
    }

}


