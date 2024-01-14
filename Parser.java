class Parser {
    private Alphabet alphabet = new Alphabet();

    public Parser() {
        this.alphabet = new Alphabet();
    }

    String convertTextToMorse(String text) {
        String output = "";
        char[] mText = text.toCharArray();
        for(int i = 0; i < mText.length; i++) {
            mText[i] = Character.toUpperCase(mText[i]);
        }

        for(int j = 0; j < text.length(); j++) {
            char l = mText[j];
            output += alphabet.charToMorse(l);
            if(l != ' ') {
                output += ' ';
            }
        }

        return output;
    }

    String convertMorseToText(String morseCode) {
        String output = "";
        char[] morseArray = morseCode.toCharArray();

        String currentCode = "";
        for(int i = 0; i < morseArray.length; i++) {
            if(morseArray[i] == ' ') {
                output += alphabet.morseToChar(currentCode);
                currentCode = "";
            } else {
                currentCode += morseArray[i];
            }
        }

        return output;
    }
}