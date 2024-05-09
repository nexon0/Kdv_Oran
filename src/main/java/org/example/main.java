import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı Yazınız : ");
        tutar = input.nextDouble();
        double kdvFiyat = tutar * kdvOran;
        double kdvlifiyat = tutar + kdvFiyat;

        System.out.println("Kdv'siz Fiyat :" + tutar);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv Fiyatı : " + kdvFiyat);
        System.out.println("Kdv'li Fiyat : " + kdvlifiyat);

    }
}