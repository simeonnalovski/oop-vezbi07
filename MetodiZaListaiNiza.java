package oop.fikt.vezbi07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Klasa MetodiZaListaiNiza, potrebna za zadaca 2
public class MetodiZaListaiNiza {
    public void listToArray (List<String> lista) {
        String[] niza = new String [lista.size()]; //kreiranje na string so golemina ista kako i listata
        lista.toArray(niza); //pretvoranje na listata vo niza
        System.out.println("Listata pretvorena vo niza:");
        for (String s : niza) {
        System.out.println(s); // pecatenje na stringovite on niza
        }
        }
        public void arrayToList (String[] niza) {
        List<String> lista = new ArrayList<String>(); // kreiranje na lista
        lista = Arrays.asList(niza); //pretvoranje na nizata vo lista
        System.out.println("Nizata pretvorena vo lista");
        for (String s : lista) {
        System.out.println(s); //pecatenje na listat
        }
        }
}
