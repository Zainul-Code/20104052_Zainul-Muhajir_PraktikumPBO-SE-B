package Modul2.Tugas;
public class anakayam {
    public static void main(String[] args) {
        int anak, i;
        anak = 10;
        for (i = anak; i > 1; i--) {
            System.out.print("\nAnak ayam Turun " + anak);
            anak = i - 1;
            System.out.println(", Mati 1 Tinggal " + anak);
        }
        System.out.println("\nAnak Ayam turun 1, Mati Satu  tinggal induknya");
    }
}

