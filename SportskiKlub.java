package oop.fikt.vezbi07;
//Klasa SportskiKlub, potrebna za zadaca 3
public class SportskiKlub implements Comparable<SportskiKlub> {
private String ime;
private String sport;
private int clenovi;
SportskiKlub(String ime,String sport,int clenovi){
    this.ime=ime;
    this.sport=sport;
    this.clenovi=clenovi;

}
 public void SetIme(String ime){
    this.ime=ime;
 }
 public void SetSport(String sport){
    this.sport=sport;
 }
 public void SetClenovi(int clenovi){
    this.clenovi=clenovi;
 }
 public String getIme(){
    return ime;
 }
 public String getSport(){
    return sport;
 }
 public int getClenovi(){
    return clenovi;
 }

    @Override
    public int compareTo(SportskiKlub o) {
        SportskiKlub a= (SportskiKlub) o;
        if(this.ime.equals(a.ime)){
        return 0;}
        else{
        return this.ime.compareTo(a.ime);
    }
}
} 

