package oop.fikt.vezbi07;
//Zadaca 1
import java.util.ArrayList;
import java.util.List;

public class Main1{
public static void main(String[] args){
    List <String> lekovi=new ArrayList<String>();
    lekovi.add("Diazepam");
    lekovi.add("Nolpaza");
    lekovi.add("Furasamid");
    lekovi.add("Paracetamol");
    int size=lekovi.size();
    if((lekovi.get(size-1).equals("Paracetamol"))){
        System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
    }else{
        System.out.println("Namenata na lekot ne e pozanata");
    }
} // vo int size se zacuvuva goleminata na listata lekovi, a so size-1 na red 14 se proverva dali posledniot element e Paracetamol
}