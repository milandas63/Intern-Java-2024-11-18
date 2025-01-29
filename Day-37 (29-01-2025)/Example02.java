package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Example02 {
	public static void main(String[] args) {
        String[][] person = { 
        		{"Draupadi Murmu","President","New Delhi"},
                {"Narendra Modi","Prime Minister","New Delhi"},
                {"Naveen Patnaik","Chief Minister","Bhubaneswar"},
                {"Amit Shah","Home Minister","New Delhi"}
              };

        List<List<String>> lPerson = new ArrayList<List<String>>();
        List<String> lItem;
        for(String[] p: person) {
        	lItem = new ArrayList<String>();
        	for(String i:p) {
        		lItem.add(i);
        	}
        	lPerson.add(lItem);
        }

        for(List<String> p:lPerson) {
        	for(String i:p) {
        		System.out.print(i+", ");
        	}
        	System.out.println();
        }
	}
}
