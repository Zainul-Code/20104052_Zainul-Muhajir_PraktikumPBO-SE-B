package Modul4.Praktikum.enkaps;

public class Tabungan {

    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    //Constructor
    public Tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    //Encapsulation
    public String getNama() {
        return nama;
    }
    //Encapsulation
    public int getNoRekening() {
        return noRekening;
    }
    //Encapsulation
    public int getSaldo() {
        return saldo;
    }
    //Encapsulation
    public int getPin() {
        return pin;
    }
}