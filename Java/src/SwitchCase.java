import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int suhu = 20;
        Scanner scan = new Scanner(System.in);
        suhu = scan.nextInt();

        switch (suhu){
            case 28 :
                System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "dingin");
                break;
            case 29 :
                System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "anget");
                break;
            case 31 :
                System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "biasa");
                break;
            case 32 :
                System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "panas");
                break;
                default:
                    System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "Suhu gak kedeteksi");
        }


    }
}
