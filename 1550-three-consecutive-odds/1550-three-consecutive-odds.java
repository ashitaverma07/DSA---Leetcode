class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int count = 0;
        for(int i =0 ; i < arr.length; i++)
        {
            // Finding out whether three consecutive odds take place
            // If not, then re-set the frequency of count variable
            if(arr[i] % 2 == 0)
                count =0;
            else
                count++;
            
            if(3 <= count)
                return true;
        }
        
        return false;
    }
}