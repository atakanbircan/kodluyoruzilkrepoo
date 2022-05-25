import java.util.Scanner;



public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,türkçe,tarih,müzik;
        Scanner inp= new Scanner(System.in);

        System.out.println("mat notunuz:");
        mat=inp.nextInt();

        System.out.println("fizik notunuz:");
        fizik=inp.nextInt();

        System.out.println("kimya notunuz:");
        kimya=inp.nextInt();


        System.out.println("türkçe notunuz:");
        türkçe=inp.nextInt();

        System.out.println("tarih notunuz:");
        tarih=inp.nextInt();

        System.out.println("müzik notunuz:");
        müzik=inp.nextInt();

        double ort;
        ort=(mat+fizik+kimya+türkçe+tarih+müzik)/6;
        System.out.println("ortlamanız: "+ort);


    }
}
