import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class caseCLasses$Test extends FunSuite {
test("testing caseclasses"){
  assert(caseCLasses.displayDetails(new FirstName("sajit"), new LastName("gupta"), new Age(22)).equals("sajit gupta is of 22 years."))
}
}
