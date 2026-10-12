public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    //constructor tanpa parameter
    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

   //constructor berparameter
   public Pegawai(String nip, String nama, double gaji){
    System.out.println("Ini constructor class Pegawai yang berparameter");
    this.nip = nip;
    this.nama = nama;
    this.gaji = gaji;
   }

    public String getInfo() {
        String info = "";
        info += "NIP     : " + nip + "\n";
        info += "Nama    : " + nama + "\n";
        info += "Gaji    : " + gaji + "\n";

        return info;
    }
}


