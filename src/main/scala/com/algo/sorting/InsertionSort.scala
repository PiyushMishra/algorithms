package com.algo.sorting

object InsertionSort extends App {

  def swap(numbers: Seq[Int], i: Int, j: Int) = {
    val temp = numbers(i);
    numbers.updated(i, numbers(j)).updated(j, temp)
  }

  /*
   *  sort in pass
   */

  def nearlySortedArray(array: Seq[Int], index: Int, count: Int): Seq[Int] = {
    count match {
      case -1 => array
      case count if (count >= 0) => if (array(count) > array(index))
        nearlySortedArray(swap(array, count, index), count, count - 1)
      else
        nearlySortedArray(array, count, count -1)
    }
  }

  /*
   * sort seq
   */

  def sort(array: Seq[Int], index: Int): Seq[Int] = {
    index match {
      case index if (index < array.length) =>
        sort(nearlySortedArray(array, index, index-1), index + 1)
      case index if (index == array.length) =>
        array
    }
  }

  val array = Seq(24, 67, 89, 24, 5, 7, 456, 789, 34, 98, -1)
  println(sort(array, 1))

}