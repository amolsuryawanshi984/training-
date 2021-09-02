//2) write a program to check voter person age is eligible or not using java exception handling mechanism 
import java.util.*;
//class VotingEligible start
class VotingEligible
{
	int vote;
	// void getData start
    void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		vote = sc.nextInt();
	}//void getData end
	// void check start
    void check()
	{
		// try block start
        try
		{
			if(vote < 18)
			{
				throw new ArithmeticException("Your Not Eligible for voting.");
			}
			else
			{
				System.out.println("Your Eligible for voting.");
			}
		}// try block end
        // catch block start
		catch(ArithmeticException ae)
		{
			System.out.println("Your Not Eligible for voting.");
		}// catch block end
	}//void check end
	public static void main(String[] args) 
	{
		VotingEligible ve = new VotingEligible();
		ve.getData();
		ve.check();
	}
}// class VotingEligible end
/* 
Output: 
Enter your age: 18
Your Eligible for voting.
*/