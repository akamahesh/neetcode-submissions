// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        quickSortHelper(pairs, 0, pairs.size() -1);
        return pairs;
    }

    public void quickSortHelper(List<Pair> arr, int s, int e){
        if(e - s +1 <=1){
            return;
        }

        Pair pivot = arr.get(e); // pivot is the last element
        int left = s; //pointer for the left side

        // partition: elements smaller than pivot on the left side
        for(int i = s; i< e; i++){
            if(arr.get(i).key < pivot.key){
                Pair temp = arr.get(left);
                arr.set(left, arr.get(i));
                arr.set(i, temp);
                left++;
            }
        }
        //move pivot in-between left & right sides
        arr.set(e, arr.get(left));
        arr.set(left, pivot);

        //quick sort left side
        quickSortHelper(arr, s, left-1);
        // quick sort right side
        quickSortHelper(arr, left+1, e);

    }
}
