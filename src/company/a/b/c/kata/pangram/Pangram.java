package company.a.b.c.kata.pangram;


public class Pangram {

    public boolean check(String sentence) {
//TODO this needs some more time to workout :)
        int numberOfCharactersinAlphabet = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (String.valueOf(sentence.charAt(i)).equals("{a-z}")) {
                numberOfCharactersinAlphabet++;
            }
        }
        return numberOfCharactersinAlphabet == 26?true:false;

    }

}