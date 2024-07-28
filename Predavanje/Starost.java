import java.util.Scanner;

public class Starost{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Vnesite leto rojstva: ");

        int letoRojstva = sc.nextInt();

        int starost = 2024 - letoRojstva;

        System.out.println("Letos ste/boste stari " + starost + ". let!");

    }

}