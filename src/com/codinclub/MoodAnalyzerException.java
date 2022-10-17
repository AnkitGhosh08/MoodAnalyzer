package com.codinclub;

/**
 * We have created our custom exception.
 * *  We have used Inheritance and extended the Exception class.
 * Then we have created a method and passed a message as input.
 * Inside the method we have called the super. It is a reference variable which is used to refer immediate parent class object.
 */
public class MoodAnalyzerException extends Exception {
    public MoodAnalyzerException(String message) {
        super(message);
    }
}