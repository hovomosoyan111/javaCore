package homework;

public class ArrayUtil {

    public static void main(String[] args) {
        // Խնդիր 1 - Տպել զանգվածի բոլոր էլեմենտները
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Խնդիր 2 - Տպել առաջին էլեմենտը
        System.out.println("First element:" + " " + numbers[0]);

        System.out.println();

        // Խնդիր 3 - Տպել վերջին էլեմենտը
        System.out.println("Last element:" + " " + numbers[numbers.length - 1]);

        System.out.println();

        // Խնդիր 4 - Տպել զանգվածի երկարությունը
        System.out.println("Array length:" + " " + numbers.length);

        System.out.println();

        // Խնդիր 5 - Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                System.out.println("Minimum number;" + " " + min);
            }
        }
        System.out.println();

// Խնդիր 6 - Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        System.out.println("Middle element:" + " " + numbers[numbers.length / 2]);
        System.out.println();

        // Խնդիր 7 - Հաշվել զույգ տվերի քանակը
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers count:" + " " + count);
        System.out.println();

        // ԽՆԴԻՐ 8 - Հաշվել կենտ թվերի քանակը
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 | numbers[i] % 2 == -1) {
                count++;
            }
        }
        System.out.println("Odd numbers count:" + " " + count);
        System.out.println();

        //Խնդիր 9 - Հաշվել զանգվածի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }
        System.out.println("Sum:" + " " + sum);
        System.out.println();

        // Խնդիր 10 - Հաշվել միջին թվաբանականը
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count++;
        }
        double n = (double) sum / count;

        System.out.println("Average:" + " " + n);
        System.out.println();

        // Բոնուսներ
// 1 Գտնել ամենամեծ թիվը
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println();

        //2 Հաշվել դրական և բացասական թվերը
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }
        System.out.println("Positive numbers count:" + " " + count);
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count++;
            }
        }
        System.out.println("Negative numbers count:" + " " + count);
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++;
            }
        }

            System.out.println("Zero count:" + " " + count);
    }
}







