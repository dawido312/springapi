package com.example.stringapi;

public class Counter {

    private final String content;

    Counter(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public int getNumbersCount() {
        int count = 0;
        for (Character character : content.toCharArray()) {
            try {
                Integer.parseInt(character.toString());
                count++;
            } catch (NumberFormatException ignored) {
            }
        }
        return count;
    }

    public int getLowerCaseCount() {
        int count = 0;
        for (char character : content.toCharArray()) {
            if (Character.isLowerCase(character)) {
                count++;
            }
        }
        return count;
    }

    public int getUpperCaseCount() {
        int count = 0;
        for (char character : content.toCharArray()) {
            if (Character.isUpperCase(character)) {
                count++;
            }
        }
        return count;
    }

    public int getSpecialCharactersCount()
    {
        return content.length() - (getNumbersCount() + getLowerCaseCount() + getUpperCaseCount());
    }
}