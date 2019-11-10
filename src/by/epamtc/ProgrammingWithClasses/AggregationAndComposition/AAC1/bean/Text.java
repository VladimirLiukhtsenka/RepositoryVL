package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Text {
    ArrayList<Sentence> sentences = new ArrayList<>();
    private Sentence titLeText;

    public Text(ArrayList<Sentence> sents) {
        this.sentences = sents;
    }

    public Text(Sentence sent) {
        sentences.add(sent);
    }

    public void addText(Sentence sentence) {
        sentences.add(sentence);
    }

    public void addText(ArrayList<Sentence> arrsent) {
        for (Sentence sent : arrsent) {
            sentences.add(sent);
        }
    }

    public Sentence getTitLeText() {
        return titLeText;
    }

    public void setTitLeText(Sentence titLeText) {
        this.titLeText = titLeText;
    }

    public void titLeText(Sentence sent) {
        this.titLeText = sent;
    }


    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + sentences +
                '}';
    }
}
