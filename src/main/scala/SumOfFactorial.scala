/**
  * Created by knoldus on 16/7/17.
  */
class SumOfFactorial {

  def factorial(n:Int):Int = {

    def comp(n:Int, fact:Int):Int = {
      if(n==1 || n==0)
        fact
      else
        comp(n-1, n*fact)
    }

    comp(n, 1)
  }


  def sum(n:Int):Int  = {

    if(n!=0)
      n%10 + sum(n/10)
    else
      0

  }



  def computeSum(n:Int):Int =   sum(factorial(n))
}
