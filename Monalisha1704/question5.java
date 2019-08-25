
public class question5 {
	static int gcd(int a,int b)
	{
		while(b!=0)
          {
			int temp=a;
                        a=b;
                        b=temp%b;
           }
			return a;
		
	}

	public static void main(String[] args) {
	int n=1;
         for(int i=1;i<21;i++)
       {
          int c=gcd(i,n);
           n=n/c*i;
         }
	System.out.println("the number is" +n);

	}

}
