class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        for (int i = 0; i < temperatures.length; i++) {
            int warmerDays = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    warmerDays = j - i;
                    break;
                }
            }
            temperatures[i] = warmerDays;
        }
        return temperatures;
    }
}
