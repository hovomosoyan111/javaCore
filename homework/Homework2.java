package homework;
public class Homework2 {
    public static void main(String[] args) {
        int[][] twoD = new int[5][5];

        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(("*") + "  ");
            }
            System.out.println();
        }
        System.out.println();

        //2

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(("*") + "  ");
            }
            System.out.println();
        }
        System.out.println();

//3

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        //4

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < 5 - i; l++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        //5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < i + 1; l++) {
                System.out.print("  " + "*" + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < 4-i; l++) {
                System.out.print("  " + "*" + " ");
            }
            System.out.println();
        }
    }
}



