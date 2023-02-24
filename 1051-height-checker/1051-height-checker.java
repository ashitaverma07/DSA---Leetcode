class Solution {
    public int heightChecker(int[] heights) {
        int[] hashHeights = new int[101];
        int minStudentsMove = 0;
        
        for(int i=0; i<heights.length; i++)
            hashHeights[heights[i]]++;
        
        for(int i=0; i<heights.length;i++){
            for(int j=1; j<101; j++){
                
                if(hashHeights[j] != 0){
                    if(heights[i] != j)
                        minStudentsMove++;
                    hashHeights[j]--;
                    break;
                }
            }
        }
        return minStudentsMove;
    }
}