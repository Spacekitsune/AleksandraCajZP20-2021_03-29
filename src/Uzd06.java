import java.util.Scanner;

public class Uzd06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Kiek dienų Jonas Mokėsi anglų kalbos?");
        int n = reader.nextInt();

        int aVal, aMin,bVal, bMin;
        int isVisoMin=0;

        for (int i =0; i<n; i++) {
            System.out.print("Kelinta pradėjo mokytis? (formatas: VV MM )");
            aVal = reader.nextInt();
            aMin = reader.nextInt();
            System.out.print("Kelinta baigė mokytis? (formatas: VV MM )");
            bVal = reader.nextInt();
            bMin = reader.nextInt();

            isVisoMin += gautiTrukmeMinutemis(aVal, aMin, bVal, bMin);
        }

        int visoVal = isVisoMin /60;
        int visoMin = isVisoMin % 60;

        gautiLaikoFormata(visoVal,visoMin);

        reader.close();
    }

    private static int gautiTrukmeMinutemis(int a, int b, int c, int d) {
        int intervalasMin =((c*60)+d)-((a*60)+b);
        return intervalasMin;
    }

    private static void gautiLaikoFormata(int a, int b) {
        System.out.println(a +" val. "+b+" min.");
    }
}
