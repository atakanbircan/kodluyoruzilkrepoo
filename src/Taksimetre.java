import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perKm, toplamKm, min, acilis, tutar;
        System.out.println("toplam km girin: ");
        toplamKm=input.nextDouble();
        min = 20;
        acilis = 10;
        perKm = 2.2;
        tutar = acilis + toplamKm * perKm;
        tutar=(tutar<20)? 20:tutar;
        System.out.println("hesap "+tutar);
    }
}
