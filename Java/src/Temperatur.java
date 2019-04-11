import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        int suhu ;

        Scanner temperatur = new Scanner(System.in);

        suhu = temperatur.nextInt();

        if (suhu <28) {
            System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "dingin");

        } else if (suhu == 29) {
            System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "Biasa");

        } else if (suhu == 31) {
            System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "Anget");

        }else if (suhu > 32){
            System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "Panas");

        } else {
            System.out.println("Suhu " + suhu + "˚" + "celcius " + "= " + "Gak kedeteksi");
        }
    }
}