import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float [] fractionalNumbers = {1.57f, 7.654f, 9.986f};

        boolean [] bool = {true, true, false, true};

        //Задача 2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);
            if (i != fractionalNumbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < bool.length; i++) {
            System.out.print(bool[i]);
            if (i != bool.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 3
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractionalNumbers.length-1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = bool.length-1; i >= 0; i--) {
            System.out.print(bool[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}