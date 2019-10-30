package by.epamtc.Strings.AsArrayOfCharacters;

import java.util.Scanner;

/*
5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class AAOF5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение содержащее черезмерное количество пробелов: ");
        String str = sc.nextLine();
        str = str.trim();
        String strPrint = "";
        char[] partStr = str.toCharArray();
        for (int i = 0; i < partStr.length - 1; i++) {
            if (partStr[i] == ' ' && partStr[i + 1] != ' ' || partStr[i] != ' ') {
                strPrint += partStr[i];
            }
        }
        strPrint += partStr[partStr.length - 1];
        System.out.println("После удаления лишних пробелов: " + strPrint);
        /*
        str = str.replaceAll("[ ]+", " ");
        str = str.trim();
        System.out.println(str);
              */
    }
}
