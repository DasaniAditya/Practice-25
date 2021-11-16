// Longest Airthmetic Subsequence

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) {
            if(map.containsKey(i-difference)) {
                map.put(i,map.get(i-difference)+1);
            } else {
                map.put(i,1);
            }
        }
        int result = 1;
        for(int i : map.keySet()) {
            result = Math.max(map.get(i),result);
        }
        return result;
    }
}

// Check If N and Its Double Exist


class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        for(int i : arr) {
            if(i == 0) {
                if(map.get(0) > 1) {
                    return true;
                }
            }
            if(map.containsKey(2*i) && i != 0) {
                return true;
            }
        }
         return false;
    }
}