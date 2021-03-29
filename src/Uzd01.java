import java.util.Scanner;

public class Uzd01 {
    public static void main(String[] args) {
        int pamoka;
        int pamokaSum=0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Kiek pamokų yra pirmadienį?");
        pamoka = reader.nextInt();
        pamokaSum += pamoka;

        System.out.println("Kiek pamokų yra antradienį?");
        pamoka = reader.nextInt();
        pamokaSum += pamoka;

        System.out.println("Kiek pamokų yra trečiadienį?");
        pamoka = reader.nextInt();
        pamokaSum += pamoka;

        System.out.println("Kiek pamokų yra ketvirtadienį?");
        pamoka = reader.nextInt();
        pamokaSum += pamoka;

        System.out.println("Kiek pamokų yra penktadienį?");
        pamoka = reader.nextInt();
        pamokaSum += pamoka;

        System.out.println("Pamokų skaičius:" +pamokaSum);
        System.out.println("Tai sudaro:" +(pamokaSum*45));

        reader.close();
    }
}
