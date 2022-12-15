package oop.fikt.vezbi07;

import java.util.HashSet;
import java.util.Set;
//Zadaca 4
public class Main4 {
    public static void main(String[] args){
        Set <String> gradovi= new HashSet<String>();
        gradovi.add("Bitola");
        gradovi.add("Demir Hisar");
        gradovi.add("Prilep");
        gradovi.add("Resen");
        gradovi.add("Krusevo");
        System.out.println(gradovi);
        // so gradovi.add() se vnesuvaat gradovite so mnozestvoto gradovi a na red 14 se pecatat elementite na mnozestvoto gradovi
    }
}
