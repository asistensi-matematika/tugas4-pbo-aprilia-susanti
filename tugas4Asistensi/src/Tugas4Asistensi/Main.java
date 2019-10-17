package Tugas4Asistensi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.print("Pilih bangun datar yang diinginkan\n1. Persegi\n2. Lingkaran\n3. Segitiga\nMasukkan pilihan Anda : ");
        int bangun = baca.nextInt();
        if (bangun==1) {
            System.out.print("Masukkan panjang sisi : ");
            double sisi = baca.nextDouble();
            BangunDatar BD1 = new BangunDatar("persegi");
            BD1.view();
            Persegi P = new Persegi(sisi,"persegi");
            P.view();}
        else if (bangun==2) {
            System.out.print("Masukkan panjang jari-jari : ");
            double jari = baca.nextDouble();
            BangunDatar BD2 = new BangunDatar("lingkaran");
            BD2.view();
            Lingkaran L = new Lingkaran(jari,"lingkaran");
            L.view();}
        else {
            System.out.print("Pilih Segitiga yg diinginkan\n1. Segitiga siku-siku\n2. Segitiga sama sisi\nMasukkan pilihan anda : ");
            int jenis = baca.nextInt();
            System.out.print("Masukkan panjang alas : ");
            double alas = baca.nextDouble();
            System.out.print("Masukkan panjang tinggi : ");
            double tinggi = baca.nextDouble();
            BangunDatar BD = new BangunDatar("segitiga");
            BD.view();
            Segitiga S = new Segitiga(alas, tinggi, "segitiga");
            S.view();
            if (jenis==1) {
                JenisSegitiga JS = new JenisSegitiga(alas,tinggi,"segitiga");
                JS.view(alas, tinggi);}
            else {
                JenisSegitiga JS = new JenisSegitiga(alas,tinggi,"segitiga");
                JS.view(alas);}    
        }
    }
}
