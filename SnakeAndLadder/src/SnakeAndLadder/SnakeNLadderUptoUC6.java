package SnakeAndLadder;

public class SnakeNLadderUptoUC6 {
	
	public static void main(String[] args){
		
		int iPosition = 0;
		
		int iTimesDieRolled=0;
		
		while (iPosition!=100)
		{
		int iDieRoll = ((int) Math.floor(Math.random()*10)%6)+1;
		iTimesDieRolled++;
		System.out.println("Number on Die is :"+iDieRoll);
		
		int iOption = (int) Math.floor(Math.random()*10)%3;
		String sOption;
		
		if (iOption ==0)
		{
			sOption = "No Play";
			System.out.println("It is a no play");
			iPosition = iPosition;
		}
		else if (iOption==1)
		{
			sOption = "Ladder";
			System.out.println("It is a  Ladder");
			if (iPosition+iDieRoll>100)
			{
				iPosition = iPosition;

			}
			else
			{
				
			iPosition = iPosition+iDieRoll;
			}
		}
		else
		{
			sOption = "Snake";
			System.out.println("It is a Snake ");
			if (iPosition -iDieRoll<0)
			{
				iPosition=0;
			}
			else
			{
				iPosition = iPosition-iDieRoll;
			}

		}
		System.out.println("Player position is " + iPosition);

}
		System.out.println("No of times die rolled " + iTimesDieRolled);
}
}
