
public class question10 {
	public static boolean isprime(int a)
	{
		int c=0;
		for(int i=1;i<=(long)Math.sqrt(a);i++)
		{
			if(a%i==0)
				c++;
			if(c>1)
				return false;
		}
		return true;
		}
	
	public static void main(String[] args) {
	int x=2000000;
	long sum=0;
	for(int i=2;i<x;i++)
	{
		if(isprime(i)==true)
		{
			sum+=i;
		}
	}
	System.out.println("sum of prime numbers is=" +sum);

	}

}
