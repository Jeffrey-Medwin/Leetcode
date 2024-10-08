public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicates remove = new RemoveDuplicates();
        int[] nums = {1, 4 ,2};
        System.out.println(remove.removeDuplicates(nums));
    }
}
