package org.example;

import java.util.NoSuchElementException;

public class BinaryTreeMorseTranslator implements MorseTranslator{

    private static final MorseNode root;

    static {
        if(Dictionary.MORSE_DICTIONARY.size() > 0) {
            root = new MorseNode();
            Dictionary.MORSE_DICTIONARY.forEach(BinaryTreeMorseTranslator::insert);
        }else {
            root = null;
        }
    }

    @Override
    public String decode(String morseCode) {
        if(checkInputEncodedString(morseCode)) {

            StringBuilder decodedStr = new StringBuilder();

            String[] input = morseCode.split(" ");
            for (String part : input) {
                if(part.equals("/")){
                    decodedStr.append(" ");
                    continue;
                }
                MorseNode morseNode = root;
                for(char curChar : part.toCharArray()){
                    morseNode = decodeLetter(morseNode, String.valueOf(curChar));
                }
                if(morseNode == null){
                    throw new  NoSuchElementException();
                }
                decodedStr.append(morseNode.letter);
            }
            return decodedStr.toString();
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String encode(String source) {
        if(source == null || source.length() == 0){
            throw new IllegalArgumentException();
        }

        StringBuilder morseCode = new StringBuilder();
        char[] inputChars = source.toUpperCase().toCharArray();
        for (int i = 0; i < inputChars.length;++i) {
            char curChar = inputChars[i];
            morseCode.append(encodeLetter(root, String.valueOf(curChar), ""));
            if(i != inputChars.length - 1) {
                morseCode.append(" ");
                if(inputChars[i+1] == ' ') {
                    morseCode.append("/").append(" ");
                    ++i;
                }
            }
        }
        return morseCode.toString();

    }

    private static void insert(String letter, String morseCode) {
        MorseNode current = root;
        for (char symbol : morseCode.toCharArray()) {
            if (symbol == '.') {
                if (current.left == null) {
                    current.left = new MorseNode();
                }
                current = current.left;
            } else if (symbol == '-') {
                if (current.right == null) {
                    current.right = new MorseNode();
                }
                current = current.right;
            }
        }
        current.letter = letter;
    }

    private String encodeLetter(MorseNode node, String letter, String path) {
        if (node == null) {
            return "";
        }
        if (node.letter.equals(letter)) {
            return path;
        }

        String leftResult = encodeLetter(node.left, letter, path + ".");
        if (!leftResult.isEmpty()) {
            return leftResult;
        }
        return encodeLetter(node.right, letter, path + "-");
    }

    private MorseNode decodeLetter(MorseNode node, String letter) {
        if (node == null) {
            return null;
        }
        if (letter.equals(".")) {
            return node.left;
        }

        if (letter.equals("-")) {
            return node.right;
        }

        return null;
    }

    private boolean checkInputEncodedString(String source){
        if(source == null || source.length() == 0){
            return false;
        }

        String pattern = "^[.\\-\\s/]*$";

        return source.matches(pattern);
    }

    protected static class MorseNode {
        protected String  letter;
        protected MorseNode left, right;
        protected MorseNode() {
            this.letter = "";
            this.left = this.right = null;
        }
    }
}
