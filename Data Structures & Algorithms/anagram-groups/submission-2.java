class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Create a count array for the 26 lowercase English letters
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Convert the array to a String to use as a key in the HashMap
            // E.g., [1, 0, 1, ...] -> "[1, 0, 1, ...]"
            String key = Arrays.toString(count);
             
            // If the key doesn't exist, add it with a new list. Then add the string.
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        // Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}
