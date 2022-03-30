package Giris;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        // değişken oluşturma
        int a,b;
        double c;

        // Scanner nesnesi oluşturma
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan veri alma
        System.out.println("a kenarını giriniz:");
        a = inp.nextInt();

        System.out.println("b kenarını giriniz:");
        b = inp.nextInt();

        // hipotenüs hesaplama
        c = (a*a) + (b*b);
        c = Math.sqrt(c);
        System.out.println("hipotenüs:" + c);

        // Üçgenin çevresini hesaplama 
        double ucgeninCevresi = ((a+ b + c) / 2) * 2;
        System.out.println("üçgenin çevresi:" + ucgeninCevresi);




        

        

    }
}
