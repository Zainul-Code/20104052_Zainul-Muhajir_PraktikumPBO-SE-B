package Modul6.Praktikum.Percobaan2;

import Modul6.Praktikum.Percobaan2.subbangun.Lingkaran;
import Modul6.Praktikum.Percobaan2.subbangun.PersegiPanjang;
import Modul6.Praktikum.Percobaan2.subbangun.Segitiga;
import Modul6.Praktikum.Persegi;

public class Mainbangun {
    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        persegi.seSisi(5);
        persegi.luas();
        persegi.keliling();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(14);
        lingkaran.luas();
        lingkaran.keliling();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(11);
        persegiPanjang.setLebar(6);
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println("");

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(7);
        segitiga.setTinggi(10);
        segitiga.luas();
        segitiga.keliling();

    }




}
