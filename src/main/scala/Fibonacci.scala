/**
  * Created by knoldus on 16/7/17.
  */
class Fibonacci {

  def fib(n:Int):Int = {

    if(n==0 || n==1)
      n
    else
      fib(n-1)+fib(n-2)

  }
}
