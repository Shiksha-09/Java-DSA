// 

// import java.util.*;

// class Solution {
//     public int longestConsecutive(int[] nums) {

//         HashSet<Integer> set = new HashSet<>();

//         for(int i = 0; i < nums.length; i++) {
//             set.add(nums[i]);
//         }

//         ArrayList<Integer> list = new ArrayList<>(set);

//         int count = 0;

//         for(int i = 0; i < list.size(); i++) {

//             int num = list.get(i);

//             if(!set.contains(num - 1)) {

//                 int length = 1;
//                 int current = num;

//                 while(set.contains(current + 1)) {
//                     current++;
//                     length++;
//                 }

//                 if(length > count) {
//                     count = length;
//                 }
//             }
//         }

//         return count;
//     }
// }



//   Without ArrayList

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Traverse HashSet
        for (int num : set) {

            // Step 3: Check starting point
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 4: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 5: Update maximum length
                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}
