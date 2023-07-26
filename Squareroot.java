package dailyjavaassignmenet;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		int number =16;
		int i=1;
		
		while (temp<=number)
		{
			if(i*i==number)
			{
				System.out.println(i);
			}
			else if(i*i<=number)
			{
				System.out.println(i);
			}
			i++;
			temp++;
		}
	}

}
