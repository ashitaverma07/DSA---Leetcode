class Solution {
    public int findLHS(int[] nums) {
        int rst = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                rst = Math.max(rst, map.get(key) + map.get(key + 1));
            }
        }
        return rst;
    }
}