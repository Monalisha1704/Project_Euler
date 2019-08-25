
public class question2 {

	public static void main(String[] args) {
    int term1=0;
    int term2=1;
    int sum=0;
    int temp=0;
    do
    {
    	if(term2%2==0)
    	{
    		sum=sum+term2;
    	}
    	    temp=term1+term2;
    	    term1=term2;
    		term2=temp;
    	
    }
              while(term2<4000000);
              System.out.println(sum);
	}

}
