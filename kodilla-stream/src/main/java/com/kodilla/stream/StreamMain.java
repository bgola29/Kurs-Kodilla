package com.kodilla.stream;


import com.kodilla.stream.person.People;
import org.w3c.dom.ls.LSOutput;

public class StreamMain {
    public static void main(String[] args) {

        People.getList().stream()
                .forEach(System.out::println);


    }
}
