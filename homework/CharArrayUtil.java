package homework;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        // Խնդիր 1 - Տպել բոլոր սիմվոլները
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // Խնդիր 2 - Հաշվել սիմվոլների քանակը
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Characters count:" + " " + count);


        //Խնդիր 3 - Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char c = 'a';
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Character 'a' count:" + " " + count);
        } else {
            System.out.println("Character 'a' count: 0 ");
        }

        //Խնդիր 4 - Հաշվել ձայնավորների քանակը
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                count++;
            }
        }
        System.out.println("Vowels count" + " " + count);

        //Խնդիր 5 - Հաշվել բաղաձայնների քանակը
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a' || chars[i] != 'e' || chars[i] != 'i' || chars[i] != 'o' || chars[i] != 'u' || chars[i] != 'A' || chars[i] != 'E' || chars[i] != 'I' || chars[i] != 'O' || chars[i] != 'U') {
                count++;
            }
        }
        System.out.println("Consonants count:" + " " + count);

        //Խնդիր 6 - Հաշվել բացատների քանակը
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Spaces count:" + " " + count);
        } else {
            System.out.println("Spaces count: 0 ");
        }

        // Խնդիր 7 - Շրջել սիմվոլների հերթականությունը
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //Խնդիր 8 - Փոխել մեծատառերը և փոքրատառերը (ՉԻ ՍՏԱՑՎԵԼ !!!)

        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = c;
                c = temp;
            }
        }
        for (int i = 0; i < chars.length; i++) {

            System.out.print(chars[i]);
        }

        System.out.println();

//Խնդիր 9 - Փոխարինել տրված սիմվոլը
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

//Խնդիր 10 - Ստուգել Palindrome -ը
        boolean IsPalindrone = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars.length - 1 - i) {
                IsPalindrone = false;
                break;
            }
        }
        if (IsPalindrone = true) {
            System.out.println("IsPalindrone: true");
        } else {
            System.out.println("IsPalindrone: false");
        }
    }
}



