import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class AccountTest extends FunSuite {
val a1 = new Account(1, "sajit", 3400)

  test("testing credit"){
    assert((a1 + 3000).balance == 6400)
  }
  test("testing debit"){
    assert((a1 - 3000).balance == 400)
  }

}
