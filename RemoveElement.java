public class RemoveElement {
    
    public int removeElement(int[] nums, int val) {
        int count = 0;
        if (nums.length > 0) {
            for (int i : nums) {
                if (i != val) {
                    nums[count] = i;
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        RemoveElement element = new RemoveElement();
        System.out.println(element.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }
}
