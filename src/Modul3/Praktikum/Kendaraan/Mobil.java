package Modul3.Praktikum.Kendaraan;
public class Mobil {

    private int roda;
    private int pintu;
    private int jok;

    //overloading (polymorphism)
    public Mobil(){}

    //overloading (polymorphism)
    public Mobil(int roda){
        this.roda = roda;
    }

    //overloading (polymorphism)
    public Mobil(int roda, int pintu, int jok) {
        this.roda = roda;
        this.pintu = pintu;
        this.jok = jok;
    }

    //Getter Roda
    public int getRoda() {
        return roda;
    }

    //Attribute
    //Setter Roda
    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public int getJok() {
        return jok;
    }

    public void setJok(int jok) {
        this.jok = jok;
    }

    //Behaviour
    public String klakson(){
        return "Tin... Tin...";
    }

    public void controlPedal(String pedal){
        if (pedal.toLowerCase().equals("gas"))
            System.out.println("Mobil maju!");
        else if(pedal.toLowerCase().equals("rem"))
            System.out.println("Mobil berhenti!");
        else System.out.println("Perintah ditolak");
    }

}