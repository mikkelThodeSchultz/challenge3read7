package com.company;
public class Main {

    public static void main(String[] args){
	// write your code here
        Read read = new Read();
        String fileText = read.textReader();
        System.out.println(read.readN(fileText, 7));
        System.out.println(read.readN(fileText, 7));
        System.out.println(read.readN(fileText, 7));
    }
}
