package Tugas08;

public abstract class AlatMusik {
    public String nama;
    public String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public abstract void mainkan();

    public void cetakInfo() {
        System.out.println("Nama Alat Musik : " + nama);
        System.out.println("Jenis           : " + jenis);
    }
}