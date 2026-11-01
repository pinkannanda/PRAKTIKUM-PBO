package Tugas08;

public class Drum extends AlatMusik {
    public String jenisDrum;

    public Drum(String nama, String jenis, String jenisDrum) {
        super(nama, jenis);
        this.jenisDrum = jenisDrum;
    }

    @Override
    public void mainkan() {
        System.out.println("Drum dimainkan dengan cara dipukul.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Drum      : " + jenisDrum);
    }
}