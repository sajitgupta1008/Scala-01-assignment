import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class PersonTest extends FunSuite {
  val o1 = new Person("sajit", 22)
  val o2 = new Person("sajit1234",23)

  test("testing compare of persons"){
    assert(o1>o2 == false)
  }
}
