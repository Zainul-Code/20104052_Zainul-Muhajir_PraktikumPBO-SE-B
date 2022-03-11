package Modul3.Tugas;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah) {
        //Substraction assignment
        //saldo = saldo + jumlah;
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        //Substraction assignment
        //saldo = saldo - jumlah;
        if (jumlah < saldo) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

        public int getSaldo () {
            return saldo;
        }
    }

