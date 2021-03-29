

public class TestAlgoritmaiAleksandra {
    public static void main(String[] args) {

        AlgoritmaiAleksandra AlgoritmaiAleksandraObject = new AlgoritmaiAleksandra();
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int array3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        AlgoritmaiAleksandra.print(array1);
        System.out.println(AlgoritmaiAleksandra.equals(array1,array2));
        System.out.println(AlgoritmaiAleksandra.equals(array3,array4));
    }


}

