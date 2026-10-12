package SistemSekolah;

import java.util.ArrayList;

public class Kelas {
    private String namaKelas;
    private ArrayList<Siswa> daftarSiswa;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
        this.daftarSiswa = new ArrayList<Siswa>();
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
    }

    public int getJumlahSiswa() {
        return daftarSiswa.size();
    }

    public String getInfo() {
        String info = "";
        info += "\tKelas        : " + namaKelas + "\n";
        info += "\tJumlah Siswa : " + daftarSiswa.size() + "\n";

        if (!daftarSiswa.isEmpty()) {
            //menyusun sendiri info siswa nya 
            for (Siswa s : daftarSiswa) {
                info += "\t\t- " + s.getInfo() + "\n";
            }
        } else {
            info += "\tBelum ada siswa\n";
        }

        return info;
    }
}
