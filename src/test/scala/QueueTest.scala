import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class QueueTest extends FunSuite {
  val l = List(1, 2, 4)
  val o = new DoubleQueue(l)
val s = new SquareQueue(l)
  test("testing enqueue of double queue"){
    assert(o.enqueue(5).list == List(1, 2, 4, 10))
  }

  test("testing dequeue of double queue"){
    assert(o.dequeue(l) == List(2,4))
  }

  test("testing enqueue of square queue"){
    assert(s.enqueue(5).list == List(1,2,4,25))
  }

  test("testing dequeue of square queue"){
    assert(o.dequeue(l) == List(2,4))
  }
}
