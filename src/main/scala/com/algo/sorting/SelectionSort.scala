package com.algo.sorting

/**
 * @author piyush
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from
 * unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
 *
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 *
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked
 * and moved to the sorted subarray.
 *
 * Following example explains the above steps:
 */

object SelectionSort extends App {
  val intmin = Int.MinValue
  val array = Seq(24, 67, 89, 24, 5, 7, 456, 789, 34, 98, -1)
  /**
   * @param array
   * @return
   * find the minimum element
   */
  def min(array: Seq[Int], acc: Seq[Int]): (Int, Seq[Int]) = {
    array match {
      case Nil => (intmin, acc)
      case x :: Nil => (x, acc)
      case x :: xs => if (x > xs.head) min(xs, acc.:+(x)) else min(x :: xs.tail, acc.:+(xs.head))
    }
  }

  def sort(array: Seq[Int], acc: Seq[Int]): Seq[Int] = {
    min(array, Seq()) match {
      case (`intmin`, _) => acc
      case (x, xs) => 
        println(x,xs)
        sort(xs, acc.:+(x))
    }
  }

  println(sort(array, Seq()))
}