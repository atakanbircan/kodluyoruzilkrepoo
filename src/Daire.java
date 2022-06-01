import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double r,pi=3.14,alan,cevre;
        System.out.println("yarı çapı girin: ");
        r=input.nextDouble();
        cevre=2*pi*r;
        alan=pi*Math.pow(r,2);
        System.out.println("dairenin çevresi: "+cevre);
        System.out.println("dairenin alanı: "+alan);

    }
}
