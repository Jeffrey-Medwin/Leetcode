import java.util.Arrays;

public class MedianOfTwoArray {
    public float median(int[] nums1, int[] nums2) {
        // float mid = 0;
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int[] mergedArray = new int[num1Length + num2Length];

        // arraycopy(src arr, src arr Position(starting), destination arr, destination arr postion (starting), destination arr postion (ending))
        System.arraycopy(nums1, 0, mergedArray, 0, num1Length);
        System.arraycopy(nums2, 0, mergedArray, num1Length, num2Length);

        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 != 0) {
            return mergedArray[mergedArray.length / 2];
        }

        System.out.println((float) (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2 ]) / 2);
        return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2 ]) / 2;
    }

    public static void main(String[] args) {
        MedianOfTwoArray twoArray = new MedianOfTwoArray();
        System.out.println(twoArray.median(new int[] {1, 2}, new int[] {3, 4}));
    }
}
