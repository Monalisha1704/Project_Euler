
public class question4 {
	public static int reverse(int n)
	{
		int rev=0,r;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int p;
		int m=0;
		for(int i=100;i<=999;i++)
		{
			for(int j=i;j<=999;j++)
			{
				p=i*j;
				int k=reverse(p);
				if(p==k)
				m=Math.max(m, k);
			}
		}
              System.out.println(m);
	}

}
