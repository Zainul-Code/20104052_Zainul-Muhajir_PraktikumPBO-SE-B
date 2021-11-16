package Modul6.Praktikum;

public class Persegi extends Bentuk {
    protected  int panjang, lebar;

    public void setSuperPanjang(int p){
        super.panjang= p;
    }
    public void setSuperLebar(int l){
        super.lebar =l;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void getLuas(){
        System.out.println("Luas super\t: "+ (super.lebar * super.panjang));
        System.out.println("Luas \t:" + (this.lebar * this.panjang));
    }

    public void seSisi(int i) {
    }

    public void luas() {
    }

    public void keliling() {
    }
}

