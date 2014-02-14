/***********************************************************************
*Given n. Generate all numbers with number of digits equal to n, such 
*that the digit to the right is greater than the left digit (ai+1 > ai). 
*E.g. if n=3 (123,124,125,……129,234,…..789)
************************************************************************/
import static java.lang.Math.pow;

public class generateNum{

    static void printNumbers(int n, int num, int pre){
       
       for(int i = pre; i < 10; i++){
          Double d = pow(10, n-1);
          int temp = num + i*d.intValue(); 
          if(n == 1)
            System.out.println(temp);
          else{
            printNumbers(n-1, temp, i + 1);
          }
       }
    }
    
    public static void main(String args[]){
        printNumbers(3, 0, 1);
    }
}
