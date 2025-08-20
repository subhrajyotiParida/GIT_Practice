package com.example.demo.java8test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaLastest {

	public static void main(String[] args) {
	 
		String nameList[]= {"SriKrishna","Aaradhya","Subhrajyoti"};
		
		/**
		 * Find the highest length string from array
		 * */
	   String bigString=Arrays.asList(nameList).stream()
		.reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println("Find the longest string "+bigString);
		
	
		
		
		/**
		 * Case1 : Find the most repetitive letter from string
		 * */
		
		String name="SubhrajyotiParida";
	     Map<String,List<String>> listMap=Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(s->s));
		System.out.println(listMap);
		
		Map<String,Long> map2=Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		System.out.println(map2);
	   List<String> repetitive=Arrays.asList(name.split("")).stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().
		filter(entry->entry.getValue()>1).map(x->x.getKey()).collect(Collectors.toList());
	
	  System.out.println(repetitive);
	  
	  /**
		 * Case2 : Find the First repetitive letter from string
		 * */
	 String firstRepetiveWrong= Arrays.asList(name.split("")).stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1).
		 findFirst().get().getKey();
	 System.out.println("First wrong repetive letter "+firstRepetiveWrong);
	 
	 System.out.println("Above result is not giving correct result as HashMap dont preserve order of insertion");
     System.out.println("While goruping tell streap to use LinkedHashmap to preserver Order");
     
     
     String firstRepetive= Arrays.asList(name.split("")).stream()
    			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
    			.entrySet().stream().filter(entry->entry.getValue()>1).
    			 findFirst().get().getKey();
    		 System.out.println("First correct  repetive letter "+firstRepetive);

    		
}
}
