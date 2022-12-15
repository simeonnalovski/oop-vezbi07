package oop.fikt.vezbi07;

import java.util.HashSet;
import java.util.Set;

//Zadaca 5a - Kreiranje na presek na dve mnozestva
public class Main5a {
    public static void main(String[] args){
        Set <String> prvo = new HashSet<String>();
        prvo.add("Python");
        prvo.add("Java");
        prvo.add("C++");
        Set <String> vtoro = new HashSet<String>();
        vtoro.add("Python");
        vtoro.add("Ruby");
        vtoro.add("Solidity");
        prvo.retainAll(vtoro); // kreiranje na presek i zacuvuvanje vo mnozestvoto prov
        System.out.println(prvo); // pecatenje na presekot

    }
}
