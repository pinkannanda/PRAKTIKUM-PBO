package Tugas09;

public class PlayableMain {
    public static void main(String[] args) {
        Gitar gitar = new Gitar("Gitar akuistik", 6);
        Bola bola = new Bola("Bola Sepak", "Sepak Bola");

        System.out.println("=== INFORMASI GITAR ===");
        System.out.println("Nama: " + gitar.nama);
        System.out.println("Jumlah Senar: " + gitar.jumlahSenar);
        gitar.mainkan();

        System.out.println();

        System.out.println("=== INFORMASI BOLA ===");
        System.out.println("Nama: " + bola.nama);
        System.out.println("Jenis Bola: " + bola.jenisBola);
        bola.mainkan();
    }
}
