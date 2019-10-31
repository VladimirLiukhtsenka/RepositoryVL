package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class ASOS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение содержащее символ 'a': ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            sb.append(symbol);
            if (symbol == 'a' || symbol == 'а') {
                sb.append('b');
            }
        }
        System.out.println(sb);
    }
}
