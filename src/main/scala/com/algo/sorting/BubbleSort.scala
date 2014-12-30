package com.algo.sorting

object BubbleSort extends App {

  def swap(numbers: Seq[Int], i: Int, j: Int) = {
    val temp = numbers(i);
    numbers.updated(i, numbers(j)).updated(j, temp)
  }

  /*
   *  sort in pass
   */

  def nearlySortedArray(array: Seq[Int], index: Int): Seq[Int] = {
    index match {
      case index if (index < array.length - 1) => if (array(index + 1) < array(index))
        nearlySortedArray(swap(array, index, index + 1), index + 1)
      else nearlySortedArray(array, index + 1)
      case index if (index == array.length - 1) => array
    }
  }

  /*
   * sort seq
   */

  def sort(array: Seq[Int], index: Int): Seq[Int] = {
    index match {
      case index if (index < array.length - 1) =>
        sort(nearlySortedArray(array, 0), index + 1)
      case index if (index == array.length - 1) =>
        array
    }
  }

  val array = Seq(24, 67, 89, 24, 5, 7, 456, 789, 34, 98, -1)
  println(sort(array, 0))
}