package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWorkTest {

    HomeWork homeWork = new HomeWork();

    @Test
    void checkTaskExampleEncode() {
        String phrase = "hello world";
        MorseTranslator morseTranslator = homeWork.morseTranslator();
        String res = morseTranslator.encode(phrase);
        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -..", res);
    }

    @Test
    void checkCommonPhraseEncode() {
        String phrase = "I love you";
        MorseTranslator morseTranslator = homeWork.morseTranslator();
        String res = morseTranslator.encode(phrase);
        assertEquals(".. / .-.. --- ...- . / -.-- --- ..-", res);
    }

    @Test
    void checkCommaEncode() {
        String phrase = "I, you";
        MorseTranslator morseTranslator = homeWork.morseTranslator();
        String res = morseTranslator.encode(phrase);
        assertEquals(".. --..-- / -.-- --- ..-", res);
    }

    @Test
    void checkTaskExampleDecode() {
        String phrase = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";
        MorseTranslator morseTranslator = homeWork.morseTranslator();
        String res = morseTranslator.decode(phrase);
        assertEquals("HELLO WORLD", res);
    }

    @Test
    void checkCommonPhraseDecode() {
        String phrase = ".. / .-.. --- ...- . / -.-- --- ..-";
        MorseTranslator morseTranslator = homeWork.morseTranslator();
        String res = morseTranslator.decode(phrase);
        assertEquals("I LOVE YOU", res);
    }

    @Test
    void checkCommaDecode() {
        String phrase = ".. --..-- / -.-- --- ..-";
        MorseTranslator morseTranslator = homeWork.morseTranslator();
        String res = morseTranslator.decode(phrase);
        assertEquals("I, YOU", res);
    }
}