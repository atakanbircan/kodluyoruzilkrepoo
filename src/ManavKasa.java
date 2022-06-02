import java.io.DataOutput;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyatArmut=2.14,fiyatElma=3.67,
                fiyatDomates=1.11,fiyatMuz=0.95,
                fiyatPatlican=5.00;
        double kgArmut,kgElma,kgDomates,kgMuz,kgPatlican;
        System.out.println("kaç kilo armut aldın: ");
        kgArmut=input.nextDouble();
        System.out.println("kaç kilo elma aldın: ");
        kgElma= input.nextDouble();
        System.out.println("kaç kilo domates aldın: ");
        kgDomates=input.nextDouble();
        System.out.println("kaç kilo muz aldın: ");
        kgMuz= input.nextDouble();
        System.out.println("kaç kilo patlıcan aldın: ");
        kgPatlican=input.nextDouble();

        double hesapArmut=kgArmut*fiyatArmut;
        double hesapElma=kgElma*fiyatElma;
        double hesapDomates=kgDomates*fiyatDomates;
        double hesapMuz=kgMuz*fiyatMuz;

        double hesapPatlican=kgPatlican*fiyatPatlican;
        double toplamHesap =hesapArmut+hesapElma+hesapDomates+hesapMuz+hesapPatlican;
        System.out.println("hesapArmut "+ hesapArmut);
        System.out.println("hesapElma "+hesapElma);
        System.out.println("hesapDomates"+hesapDomates);
        System.out.println("hesapMuz "+hesapMuz);
        System.out.println("hesapPatlican "+hesapPatlican);
        System.out.println("ödemen gereken hesap: "+toplamHesap);

    }


}
