public class Dosen extends Pegawai {
    public String nidn;

    //Constructor tanpa parameter
    public Dosen() {
        super();
        System.out.println("Ini constructor class Dosen");
    }

    //Constructor berparameter
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        System.out.println("Ini constructor class Dosen yang berparameter");
        this.nidn = nidn;
    }

    //Overriding method getInfo() milik Pegawai
    public String getInfo() {
        String info = super.getInfo();
        info += "NIDN        : " + this.nidn + "\n";

        return info;
    }

    
}

