package dailyjavaassignmenet;

public class FindTheSingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 2, 2, 1 ,3,4,5,7,5};

		int length = nums.length;

		for (int i = 0; i < length; i++) // 0<3
		{
			int count = 0;

			for (int k = 0; k < nums.length; k++) // 0<3
			{

				if (nums[i] == nums[k]) {
					count++;
				}

			}

			if (count == 1)
				System.out.println(nums[i]);
		}

	}
}
