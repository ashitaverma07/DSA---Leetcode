class Solution
{
	public int threeSumClosest(int[] A, int target)
	{
		int closestSum = 0, diff = Integer.MAX_VALUE;
		Arrays.sort(A);
		
		for(int i = 0; i < A.length - 2; i++)
		{
			int start = i + 1;
			int end = A.length - 1;            
			
			while(start < end)
			{
				int curSum = A[i] + A[start] + A[end];

				if(curSum == target) 
					return curSum;
				else if(curSum < target)
					start++;
				else
					end--;

				// When curSum is more closer to the target than closestSum
				if(Math.abs(target - curSum) < diff)
				{
					diff = Math.abs(target - curSum);
					closestSum = curSum;
				}
			}
		}	
		return closestSum;
    }}