import java.util.Scanner;
public class KdvTutarı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("lütfen tutarı giriniz: ");
        int para= inp.nextInt();
        double kdvTutar=para*18/100;
        double vergiliTutar = para+kdvTutar;
        System.out.println("KDV'siz Fiyat "+para);
        System.out.println("KDV'li Fiyat "+vergiliTutar);
        System.out.println("KDV turarı "+kdvTutar);
    }
}
