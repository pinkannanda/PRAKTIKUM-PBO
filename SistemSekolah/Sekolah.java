package SistemSekolah;

import java.util.ArrayList;

public class Sekolah {
    private String nama;
    private ArrayList<Kelas> daftarKelas;

    public Sekolah(String nama) {
        this.nama = nama;
        this.daftarKelas = new ArrayList<Kelas>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahKelas(String namaKelas) {
        Kelas kelas = new Kelas(namaKelas);
        daftarKelas.add(kelas);
    }

    public Kelas cariKelas(String namaKelas) {
        for (Kelas k : daftarKelas) {
            if (k.getNamaKelas().equalsIgnoreCase(namaKelas)) {
                return k;
            }
        }
        return null;
    }

    public String getInfo() {
        String info = "";
        info += "Sekolah : " + nama + "\n";

        if (!daftarKelas.isEmpty()) {
            for (Kelas k : daftarKelas) {
                info += k.getInfo();
            }
        } else {
            info += "Belum ada kelas\n";
        }

        return info;
    }
}