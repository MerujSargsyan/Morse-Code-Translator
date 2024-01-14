/**
* The Parser class uses the establish alphabet in Alphabet.java in order to
* translate larger text and morse code to and from. 
* Due to morse code standards (such as no lower case letter and no spacing),
* the parser outputs text in the form "ABCDE..." when translating morse code.
* Grammar symbols such as .,; are also deleted.
*
* @author Meruzhan Sargsyan
*/

class Parser {
    private Alphabet alphabet = new Alphabet();

    public Parser() {
        this.alphabet = new Alphabet();
    }

    /** 
    * Converts a given text to morse code
    *
    * @param String text to convert to morse code
    * @return String morse code representation of parameter
    */
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

    /** 
    * Converts a given morse code to text of the format:
    * ABCDEFG... (all uppercase and no spaces between words)
    *
    * @param String morseCode representation that will be converted
    * @param String text representation of the parameter
    */
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