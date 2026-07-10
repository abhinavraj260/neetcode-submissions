
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // 1. Count the frequencies using a HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // getOrDefault is a shortcut: if 'num' doesn't exist yet, it defaults to 0
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // 2. Create a Priority Queue (Min-Heap)
        // We use the same lambda sorting trick, but this time in ASCENDING order (a - b)
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );
        
        // 3. Add numbers to the heap, keeping its size strictly at 'k'
        for (int num : map.keySet()) {
            heap.add(num);
            
            // If the heap grows larger than k, immediately remove the smallest element
            if (heap.size() > k) {
                heap.poll(); 
            }
        }
        
        // 4. Extract the remaining 'k' elements into our result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        
        return result;
    }
}
