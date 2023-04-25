package nobel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Nobel {

    static private ArrayList<NobelDijasok> lista = new ArrayList<>();

    private static void openFile(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String sor = br.readLine();
        sor = br.readLine();
        while (sor != null) {
            lista.add(new NobelDijasok(sor));
            sor = br.readLine();
        }
        br.close();
    }

    private static void listaKiir() {
        for (NobelDijasok x : lista) {
            System.out.println(x);
        }
    }

    private static NobelDijasok elsoFeladat() {
        NobelDijasok nd = new NobelDijasok();
        for (NobelDijasok x : lista) {
            if (x.keresztnev.equals("Arthur B.") && x.vezeteknev.equals("McDonald")) {
                nd = x;
                System.out.println("Megvan");
                break;
            }

        }
        return nd;
    }

    private static NobelDijasok masodikFeladat() {
        NobelDijasok nd = new NobelDijasok();
        for (NobelDijasok x : lista) {
            if (x.evszam == 2017 && x.tipus.equals("irodalmi")) {
                nd = x;
            }
        }
        return nd;
    }
    private static ArrayList harmadikFeladat() {
        ArrayList<NobelDijasok> lista1 = new ArrayList<>();
        for (NobelDijasok x : lista) {
            if (x.vezeteknev ==null && x.evszam>1990) {
                lista1.add(x);
            }

        }
        return lista1;
    }

    private static ArrayList negyedikFeladat() {
        ArrayList<NobelDijasok> nd = new ArrayList<NobelDijasok>();
        for (NobelDijasok x : lista) {
            if (x.vezeteknev != null && x.vezeteknev.contains("Curie")) {
                nd.add (x);
                
            }

        }
        return nd;
    }
    private static int[] otodikFeladat(){
        int [] db = new int[6];
        for (NobelDijasok x : lista) {
            switch(x.tipus){
                case"fizikai":db[0]++;break;
                case"kémiai":db[1]++;break;
                case"orvosi":db[2]++;break;
                case"irodalmi":db[3]++;break;
                case"béke":db[4]++;break;
                case"közgazdaságtani":db[5]++;break;
                default:System.out.println("Ismeretlen Nobel díj");
            }
        }
        return db;
    }
    
    public static void main(String[] args) throws IOException {
        openFile("C:\\Users\\diak\\Documents\\Java_Tomi\\Nobel\\src\\nobel\\nobel.csv");
        //listaKiir();
        System.out.println(elsoFeladat());
        System.out.println("");
        System.out.println("Ők kaptak nóbeldíjat 2017-ben: ");
        System.out.println(masodikFeladat());
        
        ArrayList <NobelDijasok> szervezetek =harmadikFeladat();
        for (NobelDijasok szervezet: szervezetek) {
            System.out.println("\t"+szervezet);
        }
        System.out.println("");
        ArrayList <NobelDijasok> curiek =negyedikFeladat();
        for (NobelDijasok Curi: curiek) {
            System.out.println("\t"+Curi);
        }
        System.out.println("");
        int[] db = otodikFeladat();
        String [] tip = {"fizikai","kémiai","orvosi","irodalmi","béke","közgazdaságtani"};
        for (int i = 0; i < tip.length; i++) {
            System.out.println("\t"+tip[i]+"nobeldíj "+db[i]+"db");
        }
    }
    
}
