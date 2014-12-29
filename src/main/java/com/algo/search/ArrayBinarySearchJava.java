package com.algo.search;

public class ArrayBinarySearchJava {

	public static int binarySearch(int array[], int first, int last, int item) {
		int middle = (first + last) / 2;
		if (middle > array.length - 1)
			return -1;
		else if (last >= first) {
			if (array[middle] == item)
				return middle;
			else if (array[middle] < item)
				return binarySearch(array, middle + 1, last, item);
			else
				return binarySearch(array, 0, middle - 1, item);
		} else
			return -1;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 24, 27, 34, 54, 56, 76, 89, 100 };
		System.out.println(binarySearch(array, 0, array.length,
				Integer.parseInt("101")));

	}
}
