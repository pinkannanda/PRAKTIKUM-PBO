package Tugas08;

public class Gitar extends AlatMusik {
    public int jumlahSenar;

    public Gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println("Gitar dimainkan dengan cara dipetik.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Senar    : " + jumlahSenar);
    }
}