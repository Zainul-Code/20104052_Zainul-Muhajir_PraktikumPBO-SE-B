package Modul2.Praktikum.Percobaan;
import java.util.Scanner;
public class Input_data_scanner {
        public static void main (String[] args) {
            Scanner masukan = new Scanner(System.in);
            int var_a =0, var_b = 0;
            System.out.print("Masukkan nilai var "+var_a+ ":");
            var_a = masukan.nextInt();
            System.out.print("Masukkan nilai var "+var_b+ ":");
            var_b = masukan.nextInt();
            System.out.println();
            System.out.println("Variabel yang terdapat dalam program :");
            System.out.println("var_a = " + var_a);
            System.out.println("var_b = " + var_b);
        }
    }

