package com.algo.sorting

object SelectionSort extends App {

  val array = Seq(24, 67, 89, 24, 5, 7, 456, 789, 34, 98)

  /**
   * @param array
   * @return
   * find the minimum element
   */
  def min(array: Seq[Int], acc: Seq[Int]): (Int, Seq[Int]) = {
    array match {
      case Nil => (-1, acc)
      case x :: Nil => (x, acc)
      case x :: xs => if (x > xs.head) min(xs, acc.:+(x)) else min(x :: xs.tail, acc.:+(xs.head))
    }
  }

  def sort(array: Seq[Int], acc: Seq[Int]): Seq[Int] = {
    min(array, Seq()) match {
      case (-1, _) => acc
      case (x, xs) => sort(xs, acc.:+(x))
    }
  }

  println(sort(array, Seq()))
}