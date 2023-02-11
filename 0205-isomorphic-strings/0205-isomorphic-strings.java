class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character , Character> replacement = new HashMap <>();
        HashMap <Character , Boolean> used = new HashMap <>();
        for(int i = 0 ; i < s.length() ; i++) {
            if(replacement.containsKey(s.charAt(i))) {
                if(replacement.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else {
                if(used.containsKey(t.charAt(i)))
                    return false;
                replacement.put(s.charAt(i) , t.charAt(i));
                used.put(t.charAt(i) , true);
            }
        }
        return true;
    }
}