class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int key : nums) {
            frequencyMap.putIfAbsent(key, 0);
            int currentValue = frequencyMap.get(key) + 1;
            frequencyMap.put(key, currentValue);
        }
        int top = 0;
        int[] topkElement = new int[k];
        while (top < k) {
            int maxKey = getMaxKey(frequencyMap);
            topkElement[top] = maxKey;
            frequencyMap.remove(maxKey);
            top++;
        }
        return topkElement;
    }

    public int getMaxKey(HashMap<Integer, Integer> frequencyMap) {
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
