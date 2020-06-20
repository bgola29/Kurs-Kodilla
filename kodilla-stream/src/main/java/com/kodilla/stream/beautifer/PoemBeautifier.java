package com.kodilla.stream.beautifer;

public class PoemBeautifier {
    public String beautify(String text , PoemDecorator poemDecorator){
    return poemDecorator.decorate(text);
    }
}
