package Tugas4Asistensi;
public class JenisSegitiga extends Segitiga {
    public JenisSegitiga(double Alas, double Tinggi, String Jenis) {
        super(Alas, Tinggi, Jenis);}    
    public double SisiMiring(double Alas, double Tinggi) {
        return Math.sqrt((Math.pow(Alas,2))+(Math.pow(Tinggi,2)));}
    public double keliling(double Alas) { 
        return 3*Alas;}
    public double keliling(double Alas,double Tinggi) {
        return Alas+Tinggi+SisiMiring(Alas,Tinggi);}
    public void view(double Alas) {
        System.out.println("Jenis segitiga adalah Segitiga Sama Sisi\nKeliling segitiga adalah : " + keliling(Alas));}
    public void view(double Alas, double Tinggi) {
        System.out.println("Jenis segitiga adalah Segitiga Siku Siku\nKeliling segitiga adalah : " + keliling(Alas,Tinggi));}
}
