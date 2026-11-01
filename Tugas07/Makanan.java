package Tugas07;

import java.util.Date;

//inheritance(pewarisan)
public class Makanan extends Produk {
    private Date expired;
    private String komposisi;

    public Makanan() {
        super();
        this.expired = new Date();
        this.komposisi = "";
    }

    public Makanan(String nama, int harga, String stok,
                   Date expired, String komposisi) {
        
        this.expired = expired;
        this.komposisi = komposisi;
    }

    @Override 
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Expired   : " + expired);
        System.out.println("Komposisi : " + komposisi);
    }
}
