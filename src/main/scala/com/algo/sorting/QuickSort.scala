package com.algo.sorting

object QuickSort extends App {

  var numbers = Array(24, 67, 89, 24, 5, 7, 456, 789, 34, 98, -1)

  def swap(numbers: Array[Int], i: Int, j: Int) = {
    val temp = numbers(i);
    numbers.updated(i, numbers(j)).updated(j, temp)
  }

  /*
   * To sort an entire array A, the initial call is QUICKSORT(A, length[A],1).
   */

  def quickSort(p: Int, r: Int): Array[Int] = {
    if (p < r) {
      val q = partition(p, r)
      println("partion is " + q)
      quickSort(p, q - 1)
      quickSort(q + 1, r)
    } else numbers
  }

  def partition1(numbers: Array[Int], pivotIndex: Int, end: Int): Int = {
    pivotIndex match {
      case index if (pivotIndex == end) =>
        swap(numbers, pivotIndex, end)
        pivotIndex
      case index if (pivotIndex < end) => if (numbers(pivotIndex) <= numbers(end))
        partition1(swap(numbers, pivotIndex, end), pivotIndex + 1, end)
      else partition1(numbers, pivotIndex + 1, end)
    }

  }

  def partition(start: Int, end: Int): Int = {
    val pivot = numbers(end)
    var pivotIndex = start

    for (i <- pivotIndex to end - 1) {
      if (numbers(i) <= pivot) {
        numbers = swap(numbers, i, pivotIndex)
        println(numbers.toList)
        pivotIndex = pivotIndex + 1
      }
    }
    numbers = swap(numbers, pivotIndex, end)
    pivotIndex
  }

  println(quickSort(0, numbers.length - 1).toList)

}