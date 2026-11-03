package Tugas09;

public class Bola implements Playable {
    public String nama;
    public String jenisBola;

    public Bola(String nama, String jenisBola) {
        this.nama = nama;
        this.jenisBola = jenisBola;
    }

    @Override
    public void mainkan() {
        System.out.println("Bola dimainkan dengan cara ditendang.");
    }
}
