package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example01 {
	public static void main(String[] args) {
		String[] name = {"Draupadi Murmu","Narendra Modi","Naveen Patnaik","Amit Shah"};

		// Coverting array to List
		List<String> lNames = new ArrayList<String>();
		for(String n:name) {
			lNames.add(n);
		}

		System.out.println();
		System.out.println("List-Forward");
        for(String n: lNames) {
        	System.out.println(n);
        }
        
		System.out.println();
		System.out.println("List-Backward");
        for(int i=lNames.size()-1; i>=0; i--) {
        	System.out.println(lNames.get(i));
        }

		// Coverting array to Vector
        Vector<String> vNames = new Vector<String>();
        for(String n: name) {
        	vNames.add(n);
        }

		System.out.println();
		System.out.println("Vector-Forward");
        for(String n: vNames) {
        	System.out.println(n);
        }

		System.out.println();
		System.out.println("List-Backward");
		for(int i=vNames.size()-1; i>=0; i--) {
			System.out.println(vNames.get(i));
		}
	}
}
