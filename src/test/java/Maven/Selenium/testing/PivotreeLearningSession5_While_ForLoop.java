package Maven.Selenium.testing;

public class PivotreeLearningSession5_While_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int TotalTime=5;
		System.out.println("Washing  has started.Initial set time for wash is  : " +TotalTime+  " Minutes");
		
		for(int i=1;i<=TotalTime;i++) {
			
			
			if(i==5) {
				
				System.out.println("Washing complete! Total Run Time : " +i+ " Minutes");
				break;
			}
			System.out.println("Washing for minutes : " +i);
			
		}
	}

}
