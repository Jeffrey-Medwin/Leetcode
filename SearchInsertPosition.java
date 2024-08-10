public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target || nums[i] > target) {
                    return i;
                } 
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsertPosition insertPosition = new SearchInsertPosition();
        System.out.println(insertPosition.searchInsertPosition(new int[] {1, 3, 5, 6}, 7));
    }
}
