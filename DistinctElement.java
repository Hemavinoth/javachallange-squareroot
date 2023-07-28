package dailyjavaassignmenet;

public class DistinctElement {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4};
		
		int count = 0;

		// boolean rtn = true;

		for (int i = 0; i < arr.length; i++) {
			
			count++;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i]!= arr[j]) {

					break;
				}

				if(count!=1)
				{
					System.out.println("true");
				}
				else
				{
					System.out.println("false");
				}
			}

		}
	}
}
		

	
	