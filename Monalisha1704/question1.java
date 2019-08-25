
public class question1 {
	public static int sum(int n)
	{
	
	int sum=0;
	for(int i=0;i<1000;i++)
	{
		if(i%3==0||i%5==0)
		{
			sum=sum+i;
		}
	}
	System.out.println("the sum of the number is" +sum);

	}

}
