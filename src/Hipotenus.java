import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        double kisaKenarA , kisaKenarB, uzunKenar;
        System.out.println("kısa kenar girin: ");
        kisaKenarA=girdi.nextInt();
        System.out.println("diğer kısa kenarı girin: ");
        kisaKenarB=girdi.nextInt();

        uzunKenar = Math.sqrt(Math.pow(kisaKenarA,2)+Math.pow(kisaKenarB,2));
        System.out.println("uzun kenar: "+uzunKenar);
    }
}