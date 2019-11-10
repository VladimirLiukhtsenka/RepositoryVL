package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Sentence;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Text;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Word;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.view.TextView;

import java.util.ArrayList;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Word> wordsOfTitle = new ArrayList<>();
        wordsOfTitle.add(new Word("Последние"));
        wordsOfTitle.add(new Word("лучи"));
        Sentence title = new Sentence(wordsOfTitle);
        ArrayList<Word> words1 = new ArrayList<>();
        words1.add(new Word("Последние"));
        words1.add(new Word("лучи"));
        words1.add(new Word("заката"));
        Sentence sentence1 = new Sentence(words1);
        ArrayList<Word> words2 = new ArrayList<>();
        words2.add(new Word("Лежат"));
        words2.add(new Word("на"));
        words2.add(new Word("поле"));
        words2.add(new Word("сжатой"));
        words2.add(new Word("ржи"));
        Sentence sentence2 = new Sentence(words2);
        Text text = new Text(sentence1);
        text.addText(sentence2);
        text.titLeText(title);
        TextView textView = new TextView();
        textView.printText(text);
    }
}
