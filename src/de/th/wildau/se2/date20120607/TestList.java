package de.th.wildau.se2.date20120607;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {

		// old way
		int[] intArray = new int[3];
		int[] intArrayPre = new int[] { 1, 2, 3 };
		int[] intArrayPrePre = { 1, 2, 3 };

		// new way
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(5);
		System.out.println(list.toString());
		System.out.println(list.get(2));
	}

}
