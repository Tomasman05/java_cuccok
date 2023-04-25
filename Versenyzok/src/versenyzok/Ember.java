
package versenyzok;


public class Ember {
    private String nev;
    private String datum;
    private String nemzetiseg;
    private int rajtszam;

    public Ember(String sor) {
        String [] t = sor.split(";");
        this.nev = t[0];
        this.datum = t[1];
        this.nemzetiseg = t[2];
        if (t.length>3) 
            this.rajtszam = Integer.parseInt(t[3]);
        else this.rajtszam = -1;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getNemzetiseg() {
        return nemzetiseg;
    }

    public void setNemzetiseg(String nemzetiseg) {
        this.nemzetiseg = nemzetiseg;
    }

    public int getRajtszam() {
        return rajtszam;
    }

    public void setRajtszam(int rajtszam) {
        this.rajtszam = rajtszam;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", datum=" + datum + ", nemzetiseg=" + nemzetiseg + ", rajtszam=" + rajtszam + '}';
    }
    
}
