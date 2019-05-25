package cljspring.service;

import cljspring.model.LetterCount;

public class JavaService {
    public long add(final long a, final long b) { return a+b; }
    
    public LetterCount letters(final String word) { 
        return new LetterCount(word, word.length()); 
    }
}