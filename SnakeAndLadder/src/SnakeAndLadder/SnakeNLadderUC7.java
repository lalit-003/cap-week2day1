package SnakeAndLadder;

public class SnakeNLadderUC7 {

public static void main(String[] args){
		
		int iPosition1 = 0;
		int iPosition2=0;
		
		int iTimesDieRolled=0;
		
		String flag = "green";
		
		
		while (iPosition1!=100 && iPosition2!=100)
		{
			iTimesDieRolled++;
			if (flag=="green")
			{
				System.out.println("Player1 turn");
		int iDieRoll = ((int) Math.floor(Math.random()*10)%6)+1;
		
		System.out.println("Number on Die is :"+iDieRoll);
		
		int iOption = (int) Math.floor(Math.random()*10)%3;
		String sOption;
		
		if (iOption ==0)
		{
			sOption = "No Play";
			System.out.println("It is a no play");
			iPosition1 = iPosition1;
			flag="red";
		}
		else if (iOption==1)
		{
			sOption = "Ladder";
			
			System.out.println("It is a  Ladder");
			if (iPosition1+iDieRoll>100)
			{
				iPosition1 = iPosition1;
				flag="red";

			}
			else
			{
				
			iPosition1 = iPosition1+iDieRoll;
			flag="green";
			}
		}
		else
		{
			sOption = "Snake";
			flag="red";
			System.out.println("It is a Snake ");
			if (iPosition1 -iDieRoll<0)
			{
				iPosition1=0;
			}
			else
			{
				iPosition1 = iPosition1-iDieRoll;
			}

		}
			
		System.out.println("Player1 position is " + iPosition1);
		System.out.println("Player2 position is " + iPosition2);
		System.out.println("");

			}
			else
			{
				System.out.println("Player2 turn");

				int iDieRoll = ((int) Math.floor(Math.random()*10)%6)+1;
				
				System.out.println("Number on Die is :"+iDieRoll);
				
				int iOption = (int) Math.floor(Math.random()*10)%3;
				String sOption;
				
				if (iOption ==0)
				{
					flag="green";
					sOption = "No Play";
					System.out.println("It is a no play");
					iPosition2 = iPosition2;
				}
				else if (iOption==1)
				{
					sOption = "Ladder";
					System.out.println("It is a  Ladder");
					if (iPosition2+iDieRoll>100)
					{
						iPosition2 = iPosition2;
                        flag="green";
					}
					else
					{
						flag="red";
					iPosition2 = iPosition2+iDieRoll;
					}
				}
				else
				{
					sOption = "Snake";
					flag="green";
					System.out.println("It is a Snake ");
					if (iPosition2 -iDieRoll<0)
					{
						iPosition2=0;
					}
					else
					{
						iPosition2 = iPosition2-iDieRoll;
					}

				}
				System.out.println("Player1 position is " + iPosition1);

				System.out.println("Player2 position is " + iPosition2);
				System.out.println("");

					}
			
			}
		if(iPosition1==100)
		{
			System.out.println("Player1 won");
		}
		else
		{
			System.out.println("Player2 won");
		}
			


		System.out.println("No of times die rolled " + iTimesDieRolled);
}
}

