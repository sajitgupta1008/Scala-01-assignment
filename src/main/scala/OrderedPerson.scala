/**
  * Created by knoldus on 17/7/17.
  */

class Person(val name: String, val age: Int) extends Ordered[Person]{

  override  def compare(p:Person) = {

    p.name match{
      case name => this.age - p.age
      case _ => name.length - p.name.length
    }
  }
}