package Tugas4Asistensi;
public class Segitiga extends BangunDatar {
    protected double Alas, Tinggi;
    public Segitiga(double Alas, double Tinggi, String Jenis) {
        super(Jenis);
        this.Alas = Alas;
        this.Tinggi = Tinggi;}
    public double Luas(double Alas, double Tinggi) {
        return this.Alas*this.Tinggi/2;}
    public void view() {
        System.out.println("Luas segitiga adalah : " + Luas(Alas,Tinggi));}    
}
