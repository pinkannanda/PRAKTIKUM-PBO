package SistemSekolah;

public class SekolahDemo {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMA Nusantara");

        sekolah.tambahKelas("XI-A");
        sekolah.tambahKelas("XI-B");

        Kelas xiA = sekolah.cariKelas("XI-A");
        Kelas xiB = sekolah.cariKelas("XI-B");

        xiA.tambahSiswa(new Siswa("S01", "Budi"));
        xiA.tambahSiswa(new Siswa("S02", "Citra"));
        xiB.tambahSiswa(new Siswa("S03", "Dewi"));

        System.out.println(sekolah.getInfo());
    }
}