
package csudh;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Csudh {
    
    private static ArrayList<DomainName> domainLista = new ArrayList<>();
    private static void feltolt (){
        try{
            BufferedReader br = new BufferedReader(new FileReader("c:/Users/diak/Documents/adatok/csudh.txt"));
            String sor = br.readLine();
            sor = br.readLine();
            while(sor != null){
                domainLista.add(new DomainName(sor));
                sor = br.readLine();
            }
            
            br.close();
        }
        catch(Exception e){
            System.out.println("Hiba:" + e);
        }
    }
    public static void main(String[] args) {
        feltolt();
        System.out.println("3. feladat:\nDomainek száma: "+ domainLista.size());
        System.out.println("5. feladat:\nAz első domain felépítése: ");
        for (int i = 1; i < 6; i++) {
            System.out.println("\t"+i+". szint: "+domainLista.get(0).Domain(i));
        }
    }
    
}