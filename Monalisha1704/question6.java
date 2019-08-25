
public class question6 {
         static int Sq(int n){
          int a,b,c;
          a=(n*(n+1)*(2*n+1))/6;
          b=(n*(n+1))/2;
          b=b*b;
          c=Math.abs(a-b);
          return c;
     }
        public static void main(String[]args){
        int r=100;
        System.out.println(Sq(r));
    }
    }
