package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.view;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Sentence;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Word;

public class SentenceView {
    public void printSentence(Sentence sentence) {
        for (Word word : sentence.getWords()) {
            System.out.print(word.getWord() + " ");
        }
    }
}
