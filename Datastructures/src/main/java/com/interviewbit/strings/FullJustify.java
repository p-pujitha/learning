package com.interviewbit.strings;

import java.util.ArrayList;
import java.util.List;

public class FullJustify {
    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("This");
        listOfWords.add("is");
        listOfWords.add("an");
        listOfWords.add("example");
        listOfWords.add("of");
        listOfWords.add("text");
        listOfWords.add("justification.");
        ArrayList<String> output = fullJustify(listOfWords, 16);
        System.out.println(output);
    }

    private static ArrayList<String> fullJustify(ArrayList<String> words, int maxWidth) {
        ArrayList<String> lines = new ArrayList<>();
        int index = 0;

        while (index < words.size()) {
            int count = words.get(index).length();
            int last = index + 1;

            // Find the last word that fits in the current line
            while (last < words.size()) {
                if (count + 1 + words.get(last).length() > maxWidth) break;
                count += 1 + words.get(last).length();
                last++;
            }

            StringBuilder builder = new StringBuilder();
            builder.append(words.get(index));
            int diff = last - index - 1;

            // If we're on the last line or the line contains only one word
            if (last == words.size() || diff == 0) {
                for (int i = index + 1; i < last; i++) {
                    builder.append(" ");
                    builder.append(words.get(i));
                }
                // Add remaining spaces to the end of the line
                for (int i = builder.length(); i < maxWidth; i++) {
                    builder.append(" ");
                }
            } else {
                // Regular case: Distribute spaces evenly between words
                int spaces = (maxWidth - count) / diff;
                int extraSpaces = (maxWidth - count) % diff;

                for (int i = index + 1; i < last; i++) {
                    for (int j = spaces; j > 0; j--) {
                        builder.append(" ");
                    }
                    if (extraSpaces > 0) {
                        builder.append(" ");
                        extraSpaces--;
                    }
                    builder.append(" ");
                    builder.append(words.get(i));
                }
            }

            lines.add(builder.toString());
            index = last;
        }

        return lines;
    }
}

