public class InharitanceDemo {
    public static void main(String[] args) {
        // Objek 1: constructor tanpa parameter
        Dosen dosen1 = new Dosen();
        dosen1.nip = "34329837";
        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";
        System.out.println(dosen1.getInfo());

        // Objek 2: constructor berparameter
        Dosen dosen2 = new Dosen("34329838", "Budi Santoso", 3500000, "1990123456");
        System.out.println(dosen2.getInfo());
    }
}