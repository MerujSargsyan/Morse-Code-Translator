/**
* Alphabet claass initializes a hashtable that maps from Morse Code to 
* it's string value from the english alphabet A-Z and the number 0-9
*
* This class is intended to convert individual letters and create a basis
* for a larger conversion program 
*
* @author Meruzhan Sargsyan 
*/

import java.util.Hashtable;
import java.util.Map;

class Alphabet {
    private Hashtable<String, Character> alphabet = new Hashtable<>();

    /**
    * Maps Morse Code to it's alpha-numeric value based on the
    * standard alphabet
    */
    protected Alphabet() {
        alphabet.put(".-", 'A');
        alphabet.put("-...", 'B');
        alphabet.put("-.-.", 'C');
        alphabet.put("-..", 'D');
        alphabet.put(".", 'E');
        alphabet.put("..-.", 'F');
        alphabet.put("--.", 'G');
        alphabet.put("....", 'H');
        alphabet.put("..", 'I');
        alphabet.put(".---", 'J');
        alphabet.put("-.-", 'K');
        alphabet.put(".-..", 'L');
        alphabet.put("--", 'M');
        alphabet.put("-.", 'N');
        alphabet.put("---", 'O');
        alphabet.put(".--.", 'P');
        alphabet.put("--.-", 'Q');
        alphabet.put(".-.", 'R');
        alphabet.put("...", 'S');
        alphabet.put("-", 'T');
        alphabet.put("..-", 'U');
        alphabet.put("...-", 'V');
        alphabet.put(".--", 'W');
        alphabet.put("-..-", 'X');
        alphabet.put("-.--", 'Y');
        alphabet.put("--..", 'Z');

        alphabet.put(".----", '1');
        alphabet.put("..---", '2');
        alphabet.put("...--", '3');
        alphabet.put("....-", '4');
        alphabet.put(".....", '5');
        alphabet.put("-....", '6');
        alphabet.put("--...", '7');
        alphabet.put("---..", '8');
        alphabet.put("----.", '9');
        alphabet.put("-----", '0');
    }

    /** 
    * Returns the value assigned to the given morse code on the alphabet.
    * Note: intended only for one letter
    *
    * @param String the morse code to convert
    * @return Character which is the value for the paramter
    */
    Character morseToChar(String morse) {
        return alphabet.getOrDefault(morse, Character.MIN_VALUE);
    }

    /** 
    * Returns the key assigned to the given character on the alphabet.
    * Note: intended only for one letter
    *
    * @param Character the alphanumeric value to convert to morse code
    * @return String morse code representation representing the parameter
    */
    String charToMorse(Character c) {
        for(Map.Entry entry : alphabet.entrySet()) {
            if(c.equals(entry.getValue())) {
                return (String)entry.getKey();
            }
        }
        return null;
    }  
}