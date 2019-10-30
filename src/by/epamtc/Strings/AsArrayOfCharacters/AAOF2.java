package by.epamtc.Strings.AsArrayOfCharacters;

import java.util.Scanner;

/*
2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class AAOF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a sentence with at least one word \"word\": ");
        String str = sc.nextLine();
        String[] partStr = str.split(" ");
        for (int i = 0; i < partStr.length; i++) {
            if (partStr[i].equals("word")) {
                partStr[i] = "letter";
            }
            System.out.print(partStr[i] + " ");
        }
    }
}
