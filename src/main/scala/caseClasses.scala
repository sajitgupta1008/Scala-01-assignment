/**
  * Created by knoldus on 17/7/17.
  */
class  FirstName(val fname:String) extends AnyVal

class LastName(val lname : String) extends AnyVal

class Age(val age:Int) extends  AnyVal



object  caseCLasses extends App {

  def displayDetails(f: FirstName, l: LastName, a: Age) = s"${f.fname} ${l.lname} is of ${a.age} years."
}