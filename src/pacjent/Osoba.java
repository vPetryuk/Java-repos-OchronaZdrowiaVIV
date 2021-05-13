package pacjent;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String miejscowość;
    private String kod;
    private String ulica;
    private String pesel;
    private Date dataUrodzenia;
    private String mail;
    private String nrTelefonu;
    private String plec;



    public int getWiek(){
        // wyznczamy wiek Rok obecny - rok urodzenia
        LocalDate now  = LocalDate.now();
        Date date = new Date();
        LocalDate dataur = dataUrodzenia.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period p = Period.between(now,dataur);
        return p.getYears();
    }
    public boolean checkEmail(String email){
       return true;
    }

    public boolean checkPesel(){
        // 12.05.01 120501
        return true;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getMiejscowość() {
        return miejscowość;
    }
    public void setMiejscowość(String miejscowość) {
        this.miejscowość = miejscowość;
    }
    public String getKod() {
        return kod;
    }
    public void setKod(String kod) {
        this.kod = kod;
    }
    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }
    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
