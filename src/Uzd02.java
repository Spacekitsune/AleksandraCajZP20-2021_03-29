import java.util.Scanner;

public class Uzd02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Įveskite dėžių skaičių:");
        int deze = reader.nextInt();
        System.out.println("Įveskite knygų skaičių:");
        int knyga = reader.nextInt();
        System.out.println("Įveskite, kelios knygos telpa į dėžę:");
        int talpa = reader.nextInt();

        if (knyga/talpa < deze) {
            System.out.println("Knygos telpa į dėžes");
        } else {
            System.out.println("Knygos netelpa į dėžes");
            int netilpo = knyga - (deze*talpa);
            System.out.println("Į dėžes netilpo "+netilpo +" knygos/-a/-ų");
        }
        reader.close();
    }
}
