package Maven.Selenium.testing;

public class CodingPrigram8_MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,5};
		
		int MissingNumber = findMissingNumber(arr,5);
		
		System.out.println("The missing number is: " +MissingNumber);
		
	
	}

	
	
	public static int findMissingNumber(int num[],int Totalcount) {
		
		int ExpectedSum = Totalcount*((Totalcount+1)/2);
		int ActualSum = 0;
		for(int i:num) {
			ActualSum+=i;
		}
		
		int diff = ExpectedSum-ActualSum;
		return diff;
		
	}
}
