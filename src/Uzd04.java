import java.util.Scanner;

public class Uzd04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Įveskite intervalo pradžia:");
        int intervaloPradzia = reader.nextInt();

        System.out.println("Įveskite intervalo pabaigą:");
        int intervaloPabaiga = reader.nextInt();

        int marskineliuReikes =0;

        while (intervaloPradzia<=intervaloPabaiga) {
            if (intervaloPradzia % 6==0) {
                marskineliuReikes++;
            }
            intervaloPradzia++;
        }

        System.out.println("Reikalingas marškinėlių skaičius: "+marskineliuReikes);

        reader.close();
    }
}
