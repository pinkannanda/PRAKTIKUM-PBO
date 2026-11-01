package Tugas07;

import java.util.Date;

public class DemoTugas {
    public static void main(String[] args) {
        Makanan makanan = new Makanan(
            "Mochi", 15000, "30 buah",
            new Date(), "tepung, wiped cream, strawberry"
        );

        Elektronik elektronik = new Elektronik(
            "Powerbank", 200000, "15 buah",
            4, 123456
        );

        System.out.println("=== DATA MAKANAN ===");
        makanan.cetakInfo();

        System.out.println("\n=== DATA ELEKTRONIK ===");
        elektronik.cetakInfo();
    }
}