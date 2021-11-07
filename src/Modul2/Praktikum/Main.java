package Modul2.Praktikum;

import Modul2.Praktikum.Protec.ModifierProtec;

public class Main {
    public static void main(String[] args) {


        Modifier modif = new Modifier();


        System.out.println(
                modif.angkaNon
        );
        System.out.println(
                modif.angkaProtected
        );
        System.out.println(
                modif.angkaPublic
        );
        modif.printAngkaPrivate();

        ModifierProtec modifierProtec = new ModifierProtec();
        System.out.println(modifierProtec.teksPublic);
    }
}