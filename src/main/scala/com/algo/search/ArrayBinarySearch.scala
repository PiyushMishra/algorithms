package com.algo.search

import scala.annotation.tailrec

object ArrayBinarySearch extends App {
  val array = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
  def log(msg: String) = { println(msg) }

  def binarySearch(arr: Array[Int], item: Int): Int = {
    @tailrec
    def search(array: Array[Int], item: Int): Int = {
      if (array.length == 0) -1
      else if (array((array.length / 2)) == item)
        arr.indexOf(item)
      else if (array((array.length / 2)) > item)
        search(array.slice(0, array.length / 2), item)
      else
        search(array.slice((array.length / 2 + 1), array.length), item)

    }
    search(arr, item)
  }

  println(binarySearch(array, args(0).toInt))
}

