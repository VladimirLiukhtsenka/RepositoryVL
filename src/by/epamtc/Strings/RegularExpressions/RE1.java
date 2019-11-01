package by.epamtc.Strings.RegularExpressions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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
        System.out.println("Введите '1' если хотите отсортировать абзацы по количеству предложений. \n" +
                "Введите '2' если хотите в каждом предложении отсортировать слова по длине. \n" +
                "Введите '3' если хотите отсортировать лексемы в предложении по убыванию количества вхождений заданного символа. \n" +
                "Введите '0' если хотите завершить работу");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if (ans == 1) {
            SortParagraphs(textClass.text);
        }
        else if (ans==2){
            SortSentensec(textClass.text);
        }
        else if (ans==3){

        }
    }

    private static String[] SeparationOfSentences(String s) {
        String[] sents = {};
        Pattern pattern = Pattern.compile("[^\\.\\?\\!]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String sentence = matcher.group();
            int last = sents.length;
            sents = Arrays.copyOf(sents, last + 1);
            sents[last] = sentence;
        }
        return sents;
    }

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
    private static void SortParagraphs (String t){
        String[] Paragraphs = SeparationOfParagraphs(t);
        int [] quantitySentences = new int[Paragraphs.length];
        for (int i = 0; i < Paragraphs.length; i++) {
            quantitySentences[i]= SeparationOfSentences(Paragraphs[i]).length;
        }
        for (int i = quantitySentences.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (quantitySentences[j]>quantitySentences[j+1]){
                    String temps = Paragraphs [j];
                    Paragraphs [j] = Paragraphs [j+1];
                    Paragraphs [j+1] = temps;
                    int temp = quantitySentences[j];
                    quantitySentences[j]=quantitySentences[j+1];
                    quantitySentences[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < Paragraphs.length; i++) {
            System.out.println("Количество предложений: "+SeparationOfSentences(Paragraphs[i]).length);
            System.out.println(Paragraphs[i]);
        }
    }
    private static String SortWordsBylenths (String s){
        String[] words = {};
        Pattern pattern = Pattern.compile("[а-яА-яЁё]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String w = matcher.group();
            int last = words.length;
            words = Arrays.copyOf(words, last + 1);
            words[last] = w;
        }
        for (int i = words.length-1; i >0; i--) {
            for (int j = 0; j <i ; j++) {
                if (words[j].length()>words[j+1].length()){
                    String temp = words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString());
      return sb.toString();
    }
    private static void SortSentensec (String s){
        String[] parag = SeparationOfParagraphs(s);
        for (int i = 0; i < parag.length; i++) {
            String[] sentences = SeparationOfSentences(parag[i]);
            parag[i] = "";
            for (int j = 0; j < sentences.length; j++) {
                SortWordsBylenths(sentences[j]);
            }
        }
    }
 //   private static String SortLexeme (String s){

   // }
}
