package Modul7.Praktikum.Contoh1;

public class Lagu {
    String pencipta;
    String lagu;

    //Overloading
    void isiLagu(String judul){
        lagu = judul;
        pencipta = "unknown";
    }
    //Overloading
    void isiLagu(String judul, String pencipta){
        lagu = judul;
        this.pencipta = pencipta;
    }
    void cetakKeLayar(){
        System.out.println("Judul\t: " + lagu + "\n" +
                "Pencipta\t: " + pencipta);
    }
}