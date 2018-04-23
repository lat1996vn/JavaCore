class Loop
{
	public static void main(String args[])
	{
		int n;
		int i = 0;
		int sum = 0;
		n = 100/7;
		/* Loop1 by for(;;)
		for(i =1;i<n+1;i++)
		{
			sum += i; 
		}*/
		/* Loop2 by while()
		while(i<n)
		{
			sum += i + 1; 
			i++;
		}*/
		do
		{
			sum += i + 1;
			i++;
		}while(i<n);
		sum *=7;
		System.out.println("The sum of all multiples of 7 less than 100 is: " + sum);
	}
}