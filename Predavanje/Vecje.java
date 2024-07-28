import java.util.Scanner;

public class Vecje {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite prvo število: ");
        int prvo = sc.nextInt();

        System.out.print("Vnesite drugo število: ");
        int drugo = sc.nextInt();

        if (prvo > drugo) {
            System.out.println("Prvo je večje.");
        } else if (drugo > prvo) {
            System.out.println("Drugo je večje.");
        }   else {
            System.out.println("Števili sta enaki.");
        }
    }
}