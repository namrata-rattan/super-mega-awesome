
public class Testing_methods1 {
	
	public static void main(String[] args) {
		
		
		
	        
		int highscore = newmethod(true, 10000, 200, 8);
		System.out.println("Your high score is  " + highscore);
			
		  
			}

			
		public static int newmethod( boolean gameOver, int score, int bonus, int level) 

		{
			if (gameOver = true) {
					
				int FinalScore = score + (bonus * level);
			
			return FinalScore;	
			
			}
			
			
			else {
				return -1;
			}
		}
			

			
			

		
		
	}


