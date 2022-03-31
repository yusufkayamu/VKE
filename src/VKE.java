
import java.util.Scanner;

public class VKE {
    public static void main(String[] args) {
        double kilo , boy ;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu (kg) cinsinden giriniz =");
        kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu (metre) cinsinden giriniz =");
        boy = input.nextDouble();

        double VKE = kilo / (boy*boy) ;

        System.out.println("Vucut Kitle Indeksiniz" + VKE);



    }
}

