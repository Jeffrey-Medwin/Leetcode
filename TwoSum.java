import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // tradition for loop
        /*
        if (nums.length != 0) {
            for(int i = 0; i < nums.length; i++) {
                for(int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
        }
        return new int[] {};
        */


        // two pass hash
        int length = nums.length;

        if (length != 0) {
            HashMap<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                numMap.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int subractionValue = target - nums[i];

                if ((numMap.containsKey(subractionValue)) && (numMap.get(subractionValue) != i)) {
                    return new int[] {i, numMap.get(subractionValue)};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}