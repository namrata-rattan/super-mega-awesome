
public class testMethod {

	public static void main(String[] args) {
	
	
	
	
	int highScorePosition = calculateHighScorePosition(1000);
	displayHighScorePosition("ramu", highScorePosition );
    
    highScorePosition = calculateHighScorePosition(550);
    displayHighScorePosition("shamu", highScorePosition );
    
    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("munni", highScorePosition );
   
    highScorePosition = calculateHighScorePosition(22);
    displayHighScorePosition("kakaakad", highScorePosition );
    
    
    
    
    
    
    
	
	}
	public static void displayHighScorePosition(String playerName, int highScorePosition )
	{System.out.println(playerName + " managed to get " + highScorePosition +" in the final score!");
	}

    public static int calculateHighScorePosition(int playerScore)
    { 
if (playerScore >= 1000) {
	return 1;
}
else if (playerScore >= 500)
{
    return 2;
    
}
else if (playerScore >= 100)
{
		return 3;
	
}
else return 4;
}
}
