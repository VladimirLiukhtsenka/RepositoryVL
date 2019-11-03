package by.epamtc.Strings.RegularExpressions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
public class RE1 {
    private String text = "Возможно Вы уже знаете, что листья листопадных деревьев меняют цвет осенью, " +
            "потому что теряют свои зеленые молекулы хлорофилла. " +
            "Но это не объясняет то, почему листья изначально меняют свой цвет.\n" +
            "Листопадные деревья позволяют своим листьям опадать, чтобы избежать затрат на подготовку их к зиме. " +
            "Но смена листвы была бы слишком дорогостоящей, если бы деревья теряли все свои ценные питательные вещества, " +
            "которые с большим трудом добывали из почвы. " +
            "В начале деревья перерабатывают листья, разбирая изнутри клетки и аппарат фотосинтеза, чтобы вернуть себе затраченный азот и фосфор, " +
            "сохранив его в ветках до следующей весны. " +
            "Это очень сложно сделать, так как во время переработки молекулы хлорофилла продолжают поглощать солнечную энергию. " +
            "Но фотосинтез уже не происходит и они начинают передавать энергию молекулам кислорода, " +
            "которая в данный момент не использована. Эти молекулы сеют хаос, повреждая части листа, " +
            "собирающие и переносящие питательные вещества обратно к дереву. " +
            "Чтобы минимизировать этот разрушительный эффект, листья разделяют свой хлорофилл в менее опасные молекулы, " +
            "которые чаще всего прозрачные или иногда желтые.\n" +
            "После исчезновения ярко-зеленых молекул, желтые и оранжевые пигменты, которые были в листе с самого начала, " +
            "превращают листья соответственно в желтые и оранжевые. " +
            "Некоторые деревья выбирают более безопасную защиту от разрушительно эффекта хлорофилла. Когда начинается переработка листа, " +
            "деревья производят специальные пигменты, " +
            "чтобы закрыть хлорофилл от солнечного света. Эти пигменты чаще всего красные или пурпурные. " +
            "Листья деревьев, которые их используют осенью, становятся красными. " +
            "Деревья являются самыми красивыми фабриками вторичной переработки ресурсов в мире.";

    public static void main(String[] args) {
        RE1 textClass = new RE1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите '1' если хотите отсортировать абзацы по количеству предложений. \n" +
                "Введите '2' если хотите в каждом предложении отсортировать слова по длине. \n" +
                "Введите '3' если хотите отсортировать лексемы в предложении по убыванию количества вхождений заданного символа. \n" +
                "Введите '0' если хотите завершить работу");
        int ans = sc.nextInt();
        while (ans != 0) {
            if (ans == 1) {
                //отсортировать абзацы по количеству предложений
                SortParagraphs(textClass.text);
                //в каждом предложении отсортировать слова по длине
            } else if (ans == 2) {
                SortSentenses(textClass.text);
                //отсортировать лексемы в предложении по убыванию количества вхождений заданного символа
            } else if (ans == 3) {
                SortLexemeInSent(textClass.text);
            }
            System.out.println();
            System.out.println("Введите '1' если хотите отсортировать абзацы по количеству предложений. \n" +
                    "Введите '2' если хотите в каждом предложении отсортировать слова по длине. \n" +
                    "Введите '3' если хотите отсортировать лексемы в предложении по убыванию количества вхождений заданного символа. \n" +
                    "Введите '0' если хотите завершить работу");
            ans = sc.nextInt();
        }
    }
    //Раздлеление текста на предложения
    private static String[] SeparationOfSentences(String s) {
        String[] sents = {};
        Pattern pattern = Pattern.compile("[^.?!]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String sentence = matcher.group();
            int last = sents.length;
            sents = Arrays.copyOf(sents, last + 1);
            sents[last] = sentence;
        }
        return sents;
    }
    //Раздлеление текста на абзацы
    private static String[] SeparationOfParagraphs(String s) {
        String[] parags = {};
        Pattern pattern = Pattern.compile("[^\n]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String paragraf = matcher.group();
            int last = parags.length;
            parags = Arrays.copyOf(parags, last + 1);
            parags[last] = paragraf;
        }
        return parags;
    }
    //Сортировка абзацев по количеству предложений
    private static void SortParagraphs(String t) {
        String[] Paragraphs = SeparationOfParagraphs(t);
        int[] quantitySentences = new int[Paragraphs.length];
        for (int i = 0; i < Paragraphs.length; i++) {
            quantitySentences[i] = SeparationOfSentences(Paragraphs[i]).length;
        }
        for (int i = quantitySentences.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (quantitySentences[j] > quantitySentences[j + 1]) {
                    String temps = Paragraphs[j];
                    Paragraphs[j] = Paragraphs[j + 1];
                    Paragraphs[j + 1] = temps;
                    int temp = quantitySentences[j];
                    quantitySentences[j] = quantitySentences[j + 1];
                    quantitySentences[j + 1] = temp;
                }
            }
        }
        for (String paragraph : Paragraphs) {
            System.out.println("Количество предложений: " + SeparationOfSentences(paragraph).length);
            System.out.println(paragraph);
        }
    }
    //Сортировка слов по длинне
    private static void SortWordsBylenths(String s) {
        String[] words = {};
        Pattern pattern = Pattern.compile("[а-яА-яЁё]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String w = matcher.group();
            int last = words.length;
            words = Arrays.copyOf(words, last + 1);
            words[last] = w;
        }
        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        System.out.println(sb.toString());
    }
    //В каждом предложении сортировка слов по длине
    private static void SortSentenses(String s) {
        String[] parag = SeparationOfParagraphs(s);
        for (int i = 0; i < parag.length; i++) {
            String[] sentences = SeparationOfSentences(parag[i]);
            parag[i] = "";
            for (String sentence : sentences) {
                SortWordsBylenths(sentence);
            }
        }
    }
    // Сортировка лексем по входищим символом и по алфавиту
    private static String SortLexeme(String s) {
        String[] words = {};
        Pattern pattern = Pattern.compile("[а-яА-яЁё]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String w = matcher.group();
            int last = words.length;
            words = Arrays.copyOf(words, last + 1);
            words[last] = w;
        }
        int[] symbolInWordCount = new int[words.length];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String symbol = scan.next();
        for (int i = 0; i < words.length; i++) {
            int countSym = 0;
            int position = 0;
            while (position != -1) {
                position = words[i].indexOf(symbol, position);
                if (position != -1) {
                    position++;
                    countSym++;
                }
            }
            symbolInWordCount[i] = countSym;
        }

        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (symbolInWordCount[j] < symbolInWordCount[j + 1]) {
                    int temp = symbolInWordCount[j];
                    symbolInWordCount[j] = symbolInWordCount[j + 1];
                    symbolInWordCount[j + 1] = temp;
                    String tempS = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tempS;
                }
            }
        }

        for (int i = words.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (symbolInWordCount[j] == symbolInWordCount[j + 1]) {
                    if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                        String tempS = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = tempS;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }
    //Сортировка предложения по входищим символом и по алфавиту
    private static void SortLexemeInSent(String s) {
        String[] parag = SeparationOfParagraphs(s);
        int finishP = parag.length - 1;
        System.out.println("Введите номер абзаца от 0 до " + finishP + " :");
        Scanner sc = new Scanner(System.in);
        int paragnum = sc.nextInt();
        String[] sentences = SeparationOfSentences(parag[paragnum]);
        int finishS = sentences.length - 1;
        System.out.println("Введите номер предложения от 0 до " + finishS + " :");
        int sentnum = sc.nextInt();
        System.out.println(SortLexeme(sentences[sentnum]));
    }
}
