package com.example.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
    	List<String> words = new ArrayList<String>(Arrays.asList(s.split(" |\\t|\\n")));
    	words.removeIf(String::isEmpty);
    	
    	return words.size();
    }
}
