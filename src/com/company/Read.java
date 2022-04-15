package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Read {
    File file = new File("C:\\Users\\Bruger\\IdeaProjects\\Challenge3 read\\Data\\textfile.txt");
    int substringStart = 0;
    int numberOfLetters = 0;

    public String readN(String text, int number) {
        String returnString = "";
        if (numberOfLetters < number) {
            numberOfLetters = number;
        }
        if (numberOfLetters > text.length()) {
            numberOfLetters = text.length();
        }
        returnString = text.substring(substringStart, numberOfLetters);
        substringStart = numberOfLetters;
        numberOfLetters = numberOfLetters + number;
        return returnString;
    }

    public String textReader() {
        String returnString = "";
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                returnString = returnString + sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return returnString;
    }
}


