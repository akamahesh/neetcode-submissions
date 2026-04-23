class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = 0;
        int len = arr.length;
        int result = 0;
        int sumOfWindow = 0;
        while(right < len){
            if(right - left +1 > k){
                sumOfWindow -= arr[left];
                left++;
            }
            sumOfWindow += arr[right];
            if(right-left +1 == k){
                int avg = sumOfWindow/k;
                if(avg >= threshold){
                    result += 1;
                }
            }
            right++;

        }
        return result;
    }
}