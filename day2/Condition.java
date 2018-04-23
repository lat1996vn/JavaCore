class Condition
{
  public static void main(String args[])
  {
    int n = 200;
    int m = 100;    
    if( m == 0)
		System.out.println("m equal 0");
	if(m > n)
		System.out.println("m greater than n");
	if( n % 2 != 0 )
		System.out.println("n is odd");
	else
		System.out.println("n is even");
    // output exeption if not enough parameters 
  }
}