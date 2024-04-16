package org.example;
/*
Heterometrik sayılar, aralarındaki en büyük ortak bölenin 1'den farklı olduğu bir sayı dizisidir. Başka bir deyişle,
birbirine tam bölünmeyen sayılar kümesidir. Örneğin, 2 ve 3 birbirine tam bölünmez, dolayısıyla 2 ve 3 heterometrik sayılardır.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int adet,count;
        int i,j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet heterometrik sayı oluşturmak istiyorsunuz?: ");
        adet = scanner.nextInt();

        System.out.println(adet + " adet heterometrik sayı:");
        count = 0;
        for (i = 2; count < adet; i++) {
            boolean isHeterometrik = true;
            for (j = 2; j < i; j++) {
                if (gcd(i, j) != 1) {
                    isHeterometrik = false;
                    break;
                }
            }
            if (isHeterometrik) {
                System.out.println(i);
                count++;
            }
        }
    }

    // En büyük ortak böleni (Greatest Common Divisor) hesaplayan metod
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}