import java.util.Scanner;

public class Ocene {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesite št. točk: ");

        int tocke = sc.nextInt();

        if (tocke < 0 || tocke > 100) {
            System.out.println("Neveljavna vrednost tock!");

        } else if (tocke >= 90) {
            System.out.println("Ocena: 10");
        } else if (tocke >= 80) {
            System.out.println("Ocena: 9");
        } else if (tocke >= 70) {
            System.out.println("Ocena: 8");
        } else if (tocke >= 60) {
            System.out.println("Ocena: 7");
        } else if (tocke >= 50) {
            System.out.println("Ocena: 6");
        } else if (tocke < 50) {
            System.out.println("Ocena: 5");
        }

    }
}