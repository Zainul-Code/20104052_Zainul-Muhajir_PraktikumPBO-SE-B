package Modul7.Praktikum.Contoh2;

public class Burung extends Hewan {
    @Override
    void bersuara() {
        super.bersuara();
        System.out.println("Pit.. pit...");
    }

    @Override
    void terbang() {
        System.out.println("Kepakan Sayap");
    }
}