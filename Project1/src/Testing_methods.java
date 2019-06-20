
public class Testing_methods {

	public static void main(String[] args)
	
	
	{
        
	newmethod(true, 10000, 200, 8);
	newmethod(true,800,100,5);
    newmethod(false,0,0,0);
	}

	
public static void newmethod( boolean gameOver, int score, int bonus, int level) 

{
	if (gameOver = true) {
			
		int FinalScore = score + (bonus * level);
		System.out.println("Your final score is " + FinalScore);}
	
	
	else
		if (gameOver = false) {
		System.out.println("you did not complete the level");
	}
}
	

	
	

}

	

