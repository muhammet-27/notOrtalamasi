package Giris;

import java.util.Scanner;

public class meyve_kasa {
    public static void main(String[] args) {
        // değişkenleri tanımlama
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan miktar değerini alma
        System.out.print("Armut kaç kilo ? :");
        double armutKilo = inp.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        double elmaKilo = inp.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        double domatesKilo = inp.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        double muzKilo = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        double patlicanKilo = inp.nextDouble();

        // toplam miktar hesaplayıp ekrana yazdırma
        armut = armutKilo + armut;
        elma = elmaKilo + elma;
        domates = domatesKilo + domates;
        muz = muzKilo + muz;
        patlican = patlicanKilo + patlican;
        System.out.println("seçtiğiniz ürünlerin toplam tutarı : " + (armut + elma + domates + muz + patlican));
        


    }
    
}
