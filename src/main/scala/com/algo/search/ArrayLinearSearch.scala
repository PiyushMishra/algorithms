package com.algo.search

import scala.annotation.tailrec

object ArrayLinearSearch extends App {

  val arr = Array(1, 2, 34, 67, 98, 23, 87, 75)

  def linearSearch(array: Seq[Int], item: Int): Int = {
    @tailrec
    def search(arr: Seq[Int]): Int = {
      arr match {
        case Seq() => -1
        case Seq(x, rest @ _*) => if (x == item) array.indexOf(x) else search(rest)
      }

    }
    search(arr)
  }

  println(linearSearch(arr, 167))
}

/*
time complexity is O(n)
*/