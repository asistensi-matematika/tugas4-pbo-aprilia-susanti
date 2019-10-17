package Tugas4Asistensi;
public class Persegi extends BangunDatar {
    protected double sisi;
    public Persegi(double sisi, String Jenis) {
        super(Jenis);
        this.sisi = sisi;}
    public double Luas(double sisi){
        return this.sisi*this.sisi;}
    public double Keliling(double sisi) {
        return 4*this.sisi;}    
    public void view() {
        System.out.println("Luasnya adalah " + Luas(sisi) + "cm^2\nKeliling adalah " + Keliling(sisi) + "cm");}
}
