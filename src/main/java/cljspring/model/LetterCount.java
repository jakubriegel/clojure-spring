package cljspring.model;

public class LetterCount {
    private String word;
    private int count;

    public LetterCount() {};

    public LetterCount(final String word, final int count) {
        this.word = word;
        this.count = count;
    };

    public String getWord() { return word; }
    public void setWord(final String word) { this.word = word; }

    public int getCount() { return count; }
    public void setCount(final int count) { this.count = count; }
}