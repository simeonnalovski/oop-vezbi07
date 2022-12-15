package oop.fikt.vezbi07;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        MetodiZaListaiNiza object = new MetodiZaListaiNiza(); // kreiranje na objekt, preku koj ke se izvrsuvaat metodite
        List<String> lista = new ArrayList<String>();
        lista.add("Ananas");
        lista.add("Banana");
        object.listToArray(lista);
        String[] niza = {"g", "h", "j"};
        object.arrayToList(niza);
        }
}
