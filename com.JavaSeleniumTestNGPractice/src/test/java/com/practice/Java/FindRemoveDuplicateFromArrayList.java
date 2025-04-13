package com.practice.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FindRemoveDuplicateFromArrayList {
	static ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "D", "B"));
	ArrayList<String> dup = new ArrayList<String>();
	ArrayList<String> unq = new ArrayList<String>();

	public void fidDup(ArrayList<String> ar) {
		ar.add("S");
		ar.add("P");
		ar.add("S");

		ar.add("p");
		System.out.println(ar);
		for(int i=0;i<ar.size();i++) {
			for(int j=i+1;j<ar.size();j++) {
				if(ar.get(i).contains(ar.get(j))) {
					dup.add(ar.get(i));
				}
			}
		}
		System.out.println("Duplicate: "+dup);
	}

	public void removedDup() {
		System.out.println(ar);
		Iterator<String> dupItr=ar.iterator();
		while(dupItr.hasNext()) {
			String dupWord=dupItr.next();
			if(unq.contains(dupWord)) {
				dupItr.remove();
			}
			else {
				unq.add(dupWord);
			}
		}
System.out.println(unq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindRemoveDuplicateFromArrayList fr = new FindRemoveDuplicateFromArrayList();
		fr.fidDup(ar);
		fr.removedDup();

	}

}
