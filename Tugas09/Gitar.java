package Tugas09;

public class Gitar implements Playable {
    public String nama;
    public int jumlahSenar;

    public Gitar(String nama, int jumlahSenar){
        this.nama = nama;
        this.jumlahSenar = jumlahSenar;
    }

    @Override 
    public void mainkan(){
        System.out.println("Gitar dimainkan dengan cara dipetik");
    }
}
