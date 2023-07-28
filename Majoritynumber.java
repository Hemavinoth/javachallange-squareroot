package dailyjavaassignmenet;

public class Majoritynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {1,2,1};
		int length = num.length;
		
		int maxcount = 0;
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				if(num[i]==num[j])
				{
					count++;
				}
			}
				
				if(count>=length/2)
				{
					maxcount=num[i];
					break;
				}
				
				
			}
			System.out.println("majority of count is " + maxcount);
		}
		
	}


