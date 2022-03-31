package Giris;

import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        // değişkenleri tanımlama
        double boyunuz;
        int kilonuz;

        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan boyu değerini alma
        System.out.print("metre cinsinden Boyunuzu giriniz: ");
        boyunuz = inp.nextDouble();

        // kullanıcıdan kilo değerini alma
        System.out.print("Kilonuzu giriniz: ");
        kilonuz = inp.nextInt();

        // vücut kitle endeksi bulma
        double vki = kilonuz / (boyunuz * boyunuz);
        System.out.println("boyunuz: " + boyunuz + " kilonuz: " + kilonuz + " vücut kitle indeksiniz : " + vki);
    }
}
