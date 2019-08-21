
public class question3 {

	public static void main(String[] args) {
		long num=600851475143L;
		for(long c=2;c<num;c++)
		{
			while(num%c==0)
			{
				num=num/c;
				
			}
		}
          
           
        	   System.out.println("largest prime factor:" +num);
           }
	}


