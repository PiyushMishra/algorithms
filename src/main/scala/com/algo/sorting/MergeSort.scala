package com.algo.sorting

object MergeSort extends App {
  val numbers = Seq(24, 67, 89, 24, 5, 7, 456, 789, 34, 98, -1)

  def merge(left: Seq[Int], right: Seq[Int]) = {
    if (left.size > right.size) sort(left, right, Seq()) else sort(right, left, Seq())
  }

  def sort(left: Seq[Int], right: Seq[Int], result: Seq[Int]): Seq[Int] = {
    (left, right) match {
      case (xs, Nil) => result ++ xs
      case (xs, ys) => 
        if (ys(0) < xs(0)) sort(xs, ys.tail, result.:+(ys(0))) else sort(xs.tail, ys.tail, result.:+(xs(0)))
    }
  }

  def mergeSort(numbers: Seq[Int]): Seq[Int] = {
    numbers.length match {
      case 0|1 => numbers
      case x: Int =>
        val middle = numbers.length / 2
        val (leftHalf, rightHalf) = numbers.splitAt(middle)
        merge(mergeSort(leftHalf), mergeSort(rightHalf))
    }
  }

  print(mergeSort(numbers))
}
