package Jobsheet10;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();

        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19850302", "Aida, A.Md.", "198503");
        Dosen dosen3 = new Dosen("19970103", "Budi, S.Kom. M.Kom", "199701");

        // Memasukkan objek dosen ke ArrayList
        daftarDosen.add(dosen1);
        daftarDosen.add(dosen2);
        daftarDosen.add(dosen3);

        // Mengurutkan daftar dosen
        Collections.sort(daftarDosen);

        // Menampilkan hasil sorting
        System.out.println("Daftar Dosen Setelah Diurutkan:");

        for (Dosen dosen : daftarDosen) {
            dosen.displayInfo();
            System.out.println();
        }
    }
}