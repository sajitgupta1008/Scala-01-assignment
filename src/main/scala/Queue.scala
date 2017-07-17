/**
  * Created by knoldus on 17/7/17.
  */
trait Queue {

  def enqueue(x: Int): Queue

  def dequeue(l: List[Int]): List[Int] = l.tail
}

class DoubleQueue(val list: List[Int] = Nil) extends Queue {


  override def enqueue(x: Int): DoubleQueue = new DoubleQueue(list ::: List(x * 2))

  override def toString = s"$list"
}

class SquareQueue(val list: List[Int]) extends Queue {


  override def enqueue(x: Int): SquareQueue = new SquareQueue(list ::: List(x * x))

  override def toString = s"$list"
}
