package com.kodilla.stream;

import com.kodilla.stream.beautifer.PoemBeautifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Ala ma kota ", text -> " ABC " + text + " CBA "));
        System.out.println(poemBeautifier.beautify("Ala ma kota ", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Ala ma kota ", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("Ala ma kota " , text -> " &!# " + text + " &!@ " ));
    }
}
