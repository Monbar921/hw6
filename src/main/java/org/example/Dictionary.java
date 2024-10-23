package org.example;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public final static Map<String, String> MORSE_DICTIONARY = new HashMap<>();

    static {
        MORSE_DICTIONARY.put("A", ".-");
        MORSE_DICTIONARY.put("B", "-...");
        MORSE_DICTIONARY.put("C", "-.-.");
        MORSE_DICTIONARY.put("D", "-..");
        MORSE_DICTIONARY.put("E", ".");
        MORSE_DICTIONARY.put("F", "..-.");
        MORSE_DICTIONARY.put("G", "--.");
        MORSE_DICTIONARY.put("H", "....");
        MORSE_DICTIONARY.put("I", "..");
        MORSE_DICTIONARY.put("J", ".---");
        MORSE_DICTIONARY.put("K", "-.-");
        MORSE_DICTIONARY.put("L", ".-..");
        MORSE_DICTIONARY.put("M", "--");
        MORSE_DICTIONARY.put("N", "-.");
        MORSE_DICTIONARY.put("O", "---");
        MORSE_DICTIONARY.put("P", ".--.");
        MORSE_DICTIONARY.put("R", ".-.");
        MORSE_DICTIONARY.put("S", "...");
        MORSE_DICTIONARY.put("T", "-");
        MORSE_DICTIONARY.put("Q", "--.-");
        MORSE_DICTIONARY.put("U", "..-");
        MORSE_DICTIONARY.put("V", "...-");
        MORSE_DICTIONARY.put("W", ".--");
        MORSE_DICTIONARY.put("X", "-..-");
        MORSE_DICTIONARY.put("Y", "-.--");
        MORSE_DICTIONARY.put("Z", "--..");
        MORSE_DICTIONARY.put("1", ".----");
        MORSE_DICTIONARY.put("2", "..---");
        MORSE_DICTIONARY.put("3", "...--");
        MORSE_DICTIONARY.put("4", "....-");
        MORSE_DICTIONARY.put("5", ".....");
        MORSE_DICTIONARY.put("6", "-....");
        MORSE_DICTIONARY.put("7", "--...");
        MORSE_DICTIONARY.put("8", "---..");
        MORSE_DICTIONARY.put("9", "----.");
        MORSE_DICTIONARY.put("0", "-----");
        MORSE_DICTIONARY.put(",", "--..--");
        MORSE_DICTIONARY.put(".", ".-.-.-");
        MORSE_DICTIONARY.put("?", "..--..");
        MORSE_DICTIONARY.put("/", "-..-.");
        MORSE_DICTIONARY.put("-", "-....-");
        MORSE_DICTIONARY.put("(", "-.--.");
        MORSE_DICTIONARY.put(")", "-.--.-");
    }
}
