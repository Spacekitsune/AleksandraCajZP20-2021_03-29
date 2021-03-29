import java.util.Arrays;

public class AlgoritmaiAleksandra {

    public static void print(int[] array) {
       System.out.println(Arrays.toString(array));
    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean firstCheck, secondCheck = false;
        if (array1.length==array2.length) {
            firstCheck=true;
        } else {
            firstCheck=false;
        }

        if (firstCheck==true) {
            for (int i=0; i<array1.length; i++) {
                if (array1[i]==array2[i]){
                    secondCheck=true;
                } else {
                    secondCheck=false;
                }
            }
        }

        if ((firstCheck==true)&&(secondCheck==true)) {
            return true;
        } else {
            return false;
        }
    }
}
