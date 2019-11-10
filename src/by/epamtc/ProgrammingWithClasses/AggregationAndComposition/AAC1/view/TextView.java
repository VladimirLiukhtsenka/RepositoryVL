package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.view;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Sentence;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean.Text;

public class TextView {

    public void printText (Text text){
        SentenceView sentenceView = new SentenceView();
        System.out.print("* ");
        sentenceView.printSentence(text.getTitLeText());
        System.out.println("*");
        for (Sentence sent : text.getSentences()) {
            sentenceView.printSentence(sent);
            System.out.println();
        }
    }
}
