package nobel;

public class NobelDijasok {
    
    public int evszam;
    public String tipus;
    public String keresztnev;
    public String vezeteknev;

    public NobelDijasok(String sor) {
        String [] adatok= sor.split(";");
        this.evszam = Integer.parseInt(adatok[0]);
        this.tipus = adatok[1];
        this.keresztnev = adatok[2];
        if (adatok.length==4) this.vezeteknev = adatok[3];
        else this.vezeteknev=null;
    }

    public NobelDijasok() {
    }
    
    
    @Override
    public String toString() {
        return keresztnev+" "+(vezeteknev==null?"":vezeteknev)+"("+evszam+", "+tipus+")";
    }
    
}
