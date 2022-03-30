package Giris;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        // değişken oluşturma
        int mat,fizik,kimya,muzik,tarih,turkce;

        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan veri alma
        System.out.println("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();

        // not ortalaması hesaplama
        double ort = (mat + fizik + kimya + muzik + tarih + turkce) / 6.0;

        // not ortalaması ekrana yazdırma
        System.out.println("Not ortalaması:" + ort);

        // not ortalamasının 60'a kadar olup olmadığını kontrol etme
        String sonuc = (ort >= 60) ? "Geçti" : "Kaldı";
        System.out.println("Sonuç:" + sonuc);

        


    }

   
}
