package com.algo.search;

public class ArrayLinearSearchJava {

	public static int linearSerach(int[] array, int item) {
		int index = -1;
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] == item)
				index = i;
		}
		return index;
	}

	public static void main(String[] args) {

		int data[] = new int[] { 10, 20, 30, 40, 50, 60, 71, 80, 90, 91 };

		System.out.println(linearSerach(data, 8954));
	}
}

/*
 * time complexity is O(n)
 */