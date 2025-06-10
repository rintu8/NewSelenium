package Maven.Selenium.testing;

public class PivotreeJavaLearning_Session11 {
	
	
	public class MovieView {
		
		
		private String MovieName;
		private double ShowTime;
		private int SeatNumber;
		private String UserName;
		
		
		//Create a constructor
		
		
	public MovieView(String MovieName,double ShowTime,int SeatNumber,String UserName) {
		
		this.MovieName=MovieName;
		this.ShowTime=ShowTime;
		this.SeatNumber=SeatNumber;
		this.UserName=UserName;
		
	}
	
	
	//define getters and setters
			public String GetMovieName() {
				
				return MovieName;
				
			}

			
				public void SetMovieName() {
				
					this.MovieName=MovieName;
				
			}
				
				public double GetShowTime() {
					
					return ShowTime;
					
				}

				
					public void SetShowTime() {
					
					this.ShowTime=ShowTime;
					
				}
					
					public int GetSeatNumber() {
						
						return SeatNumber;
						
					}

					
						public void SetSeatNumber() {
						
						this.SeatNumber=SeatNumber;
						
					}
						
						void display() {
							
							System.out.println("Movie name is" +MovieName);
							System.out.println("ShowTime  is" +ShowTime);
							System.out.println("Seat Number is" +SeatNumber);
							System.out.println("User Name is" +UserName);
						}
		
	}
	
	
	
public static void main(String[]args) {
	
	
	MovieView mv = new MovieView(null, 0, 0, null);
	
}

	

}
