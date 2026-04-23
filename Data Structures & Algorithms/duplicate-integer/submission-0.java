class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        boolean hasDuplicates = false;
        for (int j : nums) {
            if (!numsSet.add(j)) {
                hasDuplicates = true;
                break;
            }
        }
        return hasDuplicates;
    }
}