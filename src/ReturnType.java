
public class ReturnType {

	public static void main(String[] args) {
	        
           int sum = AddNumbers (50, 60, 70);
           int sum1 = AddNumbers(10, 20, 30);
           int sum2 = AddNumbers(5, 6, 7);
           int result = sum1+sum2+(sum*100);
           System.out.println("the result of return type is: "+ result);
           
           }
	
	public static int AddNumbers (int a, int b, int c) {
		int sum= a+b+c;
		  return sum;
		  
		 
		
	}

}
