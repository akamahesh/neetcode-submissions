class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        backtrack(0,new ArrayList<Integer>(), nums, result);
        return result;
    }

    public void backtrack(int start, List<Integer> path, int[] nums, List<List<Integer>> result){
        result.add(new ArrayList<>(path)); // always add current path
        for(int i = start; i< nums.length; i++){
            path.add(nums[i]); // choose
            backtrack(i+1, path, nums, result); // explore forward
            path.remove(path.size()-1); // unchoose
        }
    }
}
