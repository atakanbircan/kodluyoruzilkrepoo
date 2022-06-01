import java.util.Scanner;
public class VucutKitleİndeksi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kilo,boy,inds;
        System.out.println("merhaba,kaç kilosun");
        kilo=input.nextDouble();
        System.out.println("boyun bilgini gir");
        boy=input.nextDouble();
        inds=kilo/Math.pow(boy,2);
        System.out.println("vücut kütle indeksiniz: "+inds);
    }
}
