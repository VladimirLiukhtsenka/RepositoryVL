package by.epamtc.Strings.AsStringsOrStringsBuilder;

/*
4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class ASOS4 {
    public static void main(String[] args) {
        String informatics = "информатика";
        String cake = "";
        cake = cake.concat(String.valueOf(informatics.charAt(7))).concat(String.valueOf(informatics.charAt(3)))
                .concat(String.valueOf(informatics.charAt(4))).concat(String.valueOf(informatics.charAt(7)));
        System.out.println(cake);
    }
}
