import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class AreaTest extends FunSuite {

  test("testing area method"){
    assert(new Area().area("rectangle", 5,5, _*_).equals("Area of rectangle is 25"))
  }


}
