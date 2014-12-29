package com.algo.search

import scala.annotation.tailrec

object ArrayBinarySearch extends App {

  /*
   * provided array is sorted
   */

  val array = Array(24, 27, 34, 54, 56, 76, 89, 100)
  def log(msg: String) = println(msg)

  def binarySearch(array: Array[Int], first: Int, last: Int, item: Int): Int = {
    val middle = (first + last) / 2
    if(middle > array.length -1) -1
    else if (last >= first) {
      if (array(middle) == item) middle
      else if (item > array(middle))
        binarySearch(array, middle + 1, last, item)
      else binarySearch(array, 0, middle - 1, item)
    } else -1
  }

  println(binarySearch(array, 0, array.length, args(0).toInt))
}

/*
complexity of algo is O(logn)
*/
