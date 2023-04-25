
package versenyzok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Versenyzok {

    private static ArrayList<Ember> emberek;
    
    public static void main(String[] args) {
        emberek = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("c:/adat/pilotak.csv"));
            String sor = br.readLine();
            int counter =0;
            String nemzetiseg = "";
            int rajtszam;
            sor = br.readLine();
            int minimum=Integer.MAX_VALUE;
            while (sor != null) {
                emberek.add(new Ember(sor));
                sor = br.readLine();
                counter++;
            }
            br.close();
            System.out.println("Összesen "+counter+" sor van a listában.");
            System.out.println("Az utolsó a listán: "+emberek.get(counter-1).getNev());
            for (int i = 0; i < emberek.size(); i++) {
                String date = emberek.get(i).getDatum();
                if (date.substring(0, 2).equals("18")|| date.substring(0, 4).equals("1900")) {
                    System.out.println(emberek.get(i).getNev()+" "+emberek.get(i).getDatum());
                }
                if(emberek.get(i).getRajtszam()< minimum && emberek.get(i).getRajtszam()>-1 ){
                    minimum=emberek.get(i).getRajtszam();
                    nemzetiseg = emberek.get(i).getNemzetiseg();
                }
                
                int db=0;
                rajtszam = emberek.get(i).getRajtszam();
                if(rajtszam==-1)continue;
                for (int j = i; j < emberek.size(); j++) {
                    if (emberek.get(j).getRajtszam()==rajtszam) {
                        db++;
                    }
                    if (db>1) {
                        System.out.print(rajtszam+", ");
                    }
                }
            }
            System.out.println("A legkisebb rajtszám: "+minimum+", nemzetisége: "+nemzetiseg);
            
        }
        catch(IOException hiba){
            System.out.println("Hiba a fájl kezelésében: "+ hiba);
        }
        
    }
    public static String firstTwo(String str) {
        return str.substring(0, 2);
    }
}
