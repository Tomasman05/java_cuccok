
package csudh;


public class DomainName {
    private String domain;
    private String ip;
    private int level = 0;
    static int sorszam =0;
    
    private void setLevel(){
        String [] t = this.domain.split("\\.");
        this.level=t.length;
    }

    public DomainName(String domain, String ip) {
        this.domain = domain;
        this.ip = ip;
        setLevel();
        sorszam++;
    }
    public DomainName(String sor) {
        String [] t = sor.split(";");
        this.domain = t[0];
        this.ip = t[1];
        setLevel();
        sorszam++;
    }

    public String Domain(int szint){
        if (this.level<szint) {
            return "Nincs";
        }
        String[] t = domain.split("\\.");
        return t[t.length-szint];
    }
    
    public String getDomain() {
        return domain;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        String vissza= "<tr>"
                +"<th style = 'text-align: left>'"+this.sorszam
                +"<td>" + domain + "</td><td>" + ip + "</td></tr>";
        for (int i = 1; i < 6; i++) {
            vissza +="<td>"+this.Domain(i)+"</td>";
        }
        return vissza;
    }
    
}
