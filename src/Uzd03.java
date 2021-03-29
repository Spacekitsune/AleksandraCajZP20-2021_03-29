import java.util.Scanner;

public class Uzd03 {
    public static void main(String[] args) {
        int a = -100;
        int b = -199;

        System.out.println("Ciklas while:");

        while (b<=a) {
            System.out.print(a+" ");
            a-=3;
        }

        System.out.println("Ciklas for:");

        for (int i=-100; i>=-199; i-=3) {
            System.out.print(i+" ");
        }
    }
}
