package Jobsheet10;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();

        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Dosen dosen2 = new Dosen("19850302", "Aida, A.Md.", "198503");
        Dosen dosen3 = new Dosen("19970103", "Budi, S.Kom. M.Kom", "199701");

        Collections.sort(daftarDosen);

        daftarDosen.add(dosen1);
        daftarDosen.add(dosen2);
        daftarDosen.add(dosen3);
    }
}