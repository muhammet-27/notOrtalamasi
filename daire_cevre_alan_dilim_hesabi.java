package Giris;

import java.util.Scanner;

public class daire_cevre_alan_dilim_hesabi {
    public static void main(String[] args) {
        // değişkenleri tanımlama
        int r,aciOlcusu;
        double pi = 3.14;

        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan r değerini alma
        System.out.print("yarıçap giriniz:");
        r = inp.nextInt();
        
        // kullanıcıdan aciOlcusu değerini alma
        System.out.print("açı ölçüsü giriniz: ");
        aciOlcusu = inp.nextInt();

        // alan ve çevre hesaplama
        double cevre = 2 * pi * r;
        double alan = (pi * (r * r) * aciOlcusu) / 360;
        System.out.println("Daire çevresi: " + cevre);
        System.out.println("Daire alanı: " + alan);

       

        
    }
    
}
