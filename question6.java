
public class question6 {
	public static void main(String[] args) {
    	 int sumofsquares=0;
    	 for(int i=1;i<=100;i++)
    	 {
    		 sumofsquares=sumofsquares+(i*i);
    	 }
     System.out.println("sum of squares of first hundred numbers is " +sumofsquares);
	

     int squareofsum=0;
    	 for(int j=1;j<=100;j++)
    	 {
    		 squareofsum=squareofsum +j;
    	 }
    	 System.out.println("square of the sum is"+squareofsum);
     
     
       System.out.println("difference is" +((squareofsum*squareofsum)-sumofsquares));
}
}
