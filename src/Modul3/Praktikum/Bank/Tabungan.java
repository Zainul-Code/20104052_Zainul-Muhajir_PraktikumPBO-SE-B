package Modul3.Praktikum.Bank;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambilUang(int jumlah){
        //Substraction assignment
        //saldo = saldo - jumlah;
        //saldo = saldo - jumblah dan harus menggunakan titk awak
        saldo -= jumlah;
    }

    public int getSaldo(){
        return saldo;
    }
}