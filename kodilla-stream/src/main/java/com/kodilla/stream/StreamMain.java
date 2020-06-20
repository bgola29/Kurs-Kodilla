package com.kodilla.stream;


import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Jest to pierwsze uruchomienie generatora w trybie stream");
        NumbersGenerator.generateEven(25);
    }
}
