package Tugas08;

public class DemoAlatMusik {
    public static void main(String[] args) {

        Gitar gitar1 = new Gitar("Gitar", "Petik", 6);
        gitar1.cetakInfo();
        gitar1.mainkan();

        Drum drum1 = new Drum("Drum", "Pukul", "Akustik");
        drum1.cetakInfo();
        drum1.mainkan();
    }
}