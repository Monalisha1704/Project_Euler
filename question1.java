
public class question1 {
	public static int sum(int n)
	{
	
	int sum=0;
	for(int i=0;i<n;i++)
	{
		if(i%3==0||i%5==0)
		{
			sum++;
		}
	}
	return sum;
	}
	public static void main(String[]args)
	{
		int x=sum(1000);
	System.out.println("the sum of the number is" +x);

	}

}
