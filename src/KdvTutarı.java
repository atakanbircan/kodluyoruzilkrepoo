import java.util.Scanner;
public class KdvTutarı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("lütfen tutarı giriniz: ");
        double para= inp.nextDouble();
        double kdvOran=0.18;
        double kdvTutar=para*kdvOran;
        double vergiliTutar = para+kdvTutar;
        System.out.println("KDV'siz Fiyat "+para);
        System.out.println("kdv oran "+kdvOran);
        System.out.println("KDV'li Fiyat "+vergiliTutar);
        System.out.println("KDV turarı "+kdvTutar);
    }
}
