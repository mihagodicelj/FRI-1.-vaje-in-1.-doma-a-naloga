import java.util.Scanner;

public class Bonboni {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        int p = sc.nextInt();

        int rezultat = b / p;

        int ostanek = b % p;

        System.out.println(rezultat);

        System.out.println(ostanek);
    }
}