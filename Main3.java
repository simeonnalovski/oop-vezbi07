package oop.fikt.vezbi07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args){
        List<SportskiKlub> Lista=new ArrayList<SportskiKlub>(); // kreiranje na Lista od objekti Sportski Klub
        Lista.add(new SportskiKlub("KK Rabotnicki","kosarka",20));
        Lista.add(new SportskiKlub("FK Pelister","fudbal",30));
        Lista.add(new SportskiKlub("RK Vardar","rakomet",27));
        Collections.sort(Lista);
        for(SportskiKlub a :Lista){
            System.out.println(a.getIme());
            System.out.println(a.getSport());
            System.out.println(a.getClenovi());
        }
    }
}
