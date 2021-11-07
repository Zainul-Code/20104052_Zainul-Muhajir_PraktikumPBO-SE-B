package Modul2.Tugas;

import java.util.Scanner;
public class Hasil_operasi {
    public static int a, b, c, a2, b2, c2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumblah Tetcase : ");
        int tetcase = scanner.nextInt();

        System.out.print("Nilai A1: ");
        a = scanner.nextInt();
        System.out.print("Nilai B1: ");
        b = scanner.nextInt();
        System.out.print("Nilai C1: ");
        c = scanner.nextInt();
        System.out.print("Nilai A2: ");
        a2 = scanner.nextInt();
        System.out.print("Nilai B2: ");
        b2 = scanner.nextInt();
        System.out.print("Nilai C2: ");
        c2 = scanner.nextInt();
        System.out.println();

        System.out.println("Output");
        int casepertama = a + b - c;
        int caseke2 = a2 +b2 - c2;

        System.out.println(casepertama);
        System.out.println(caseke2);

    }
}
