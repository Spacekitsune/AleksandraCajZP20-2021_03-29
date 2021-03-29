import java.util.Scanner;

public class Uzd05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Įveskite pirmą pažymį:");
        int p1 = reader.nextInt();

        System.out.println("Įveskite antrą pažymį:");
        int p2 = reader.nextInt();

        System.out.println("Įveskite trečią pažymį:");
        int p3 = reader.nextInt();

        System.out.println("Geriausias pažymys: "+(gautiGeriausiaIvertinima(p1,p2,p3)));

        reader.close();
    }

    private static int gautiGeriausiaIvertinima(int a, int b, int c) {
        int geriausias = Math.max(a,Math.max(b,c));
        return geriausias;
    }
}
