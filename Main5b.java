package oop.fikt.vezbi07;
import java.util.HashSet;
import java.util.Set;

//Zadaca 5b - Kreiranje na unija na dve mnozestva
public class Main5b {
    public static void main(String[] args){
        Set <String> prvo = new HashSet<String>();
        prvo.add("Python");
        prvo.add("Java");
        prvo.add("C++");
        Set <String> vtoro = new HashSet<String>();
        vtoro.add("Python");
        vtoro.add("Ruby");
        vtoro.add("Solidity");
        prvo.addAll(vtoro); // kreiranje na unija i zacuvuvanje vo mnozestvoto prov
        System.out.println(prvo); // pecatenje na unijata

    }
}
