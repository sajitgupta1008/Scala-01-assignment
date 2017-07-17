import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class SumListTest extends FunSuite {


  val l = List(1, 2, 3, 4, 5)
  val l2 = List(10, 20, 30, 40, 50)

  test("testSumList") {
    assert(new SumList().sumList(l, l2) == List(11, 22, 33, 44, 55))
  }

}

