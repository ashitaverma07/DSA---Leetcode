class Solution {
    public int sumOddLengthSubarrays(int[] arr) {   
        int total = 0;
        int n =  arr.length;
        
        for(int wsize = 1; wsize<=n; wsize+=2){
            for(int i=0; i+wsize <=n; i+=1 )
            {
                for(int j=i; j < i+wsize; j+=1)
                    total+=arr[j];
            }
        }
        return total;
    }
}