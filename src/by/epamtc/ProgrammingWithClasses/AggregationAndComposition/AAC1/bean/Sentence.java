package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC1.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Sentence {
    private ArrayList<Word> words = new ArrayList<>();

    public Sentence(Word word) {
        words.add(word);
    }

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }
}
