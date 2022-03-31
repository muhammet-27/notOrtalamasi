package Giris;

import java.util.Scanner;

public class km_tutari {
    public static void main(String[] args) {
        // değişkenleri tanımlama
        int km;
        double mimimum = 20;
        double kmTutari = 2.20;
        double taksimetreAcilis = 10;

        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan km değerini alma
        System.out.print("km giriniz: ");
        km = inp.nextInt();

        // km değerinin minimum değerinden küçükse veya büyükse yapılacak işlemler
        double tutar = (km * kmTutari) + taksimetreAcilis;
        String mesaj = tutar < 20 ? "Minimum alınacak ücret: " + mimimum : "girdğiniz km: " + km + " km tutarı: " + tutar;
        System.out.println(mesaj);

    }
    
}
