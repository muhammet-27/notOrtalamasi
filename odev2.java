package Giris;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        // değişken oluşturma
        double tutar;
        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);


        // kullanıcıdan veri alma
        System.out.println("Lütfen para tutarını giriniz:");
        tutar = inp.nextDouble();

        // kullanıcıdan girilen fyatın kdvli ve kdvsiz fiyatını hesaplama
        double kdv = (tutar * 18) / 100;
        double toplam = tutar + kdv;
        System.out.println("KDV'siz fiyat: " + tutar  + " KDV'li fiyat: " + toplam + " KDV tutarı: " + kdv);

        // girilen tutar 0 ile 1000 arasında ise ekrana %18'lik bir kdv oranlı fiyat yazılacak 1000 TL'den fazla ise %8'lik bir kdvli fiyat yazılacak.
        double binUzeri = (tutar * 8) / 100;
        double toplam2 = tutar + binUzeri;
        double sonuc = (tutar > 0 && tutar < 1000) ? toplam : toplam2;
        System.out.println("Sonuç:" + sonuc);
    }
    
}
