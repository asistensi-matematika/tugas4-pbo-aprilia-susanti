package Tugas4Asistensi;

public class Lingkaran extends BangunDatar {
    protected double jarijari;
    public Lingkaran(double jarijari, String Jenis) {
        super(Jenis);
        this.jarijari = jarijari;}
    public double Luas(double jarijari) {
        return Math.PI*this.jarijari*this.jarijari;}
    public double Keliling(double jarijari) {
        return Math.PI*this.jarijari*2;}
    public void view() {
        System.out.println("Luas lingkaran adalah " + Luas(jarijari) + "cm^2\nKeliling lingkaran adalah " + Keliling(jarijari) + "cm");}
}
