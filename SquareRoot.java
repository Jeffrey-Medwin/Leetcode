public class SquareRoot {
    public int sqrt(int x) {

        if (x == 0) return 0;
        if (x == 1) return 1;

        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            // to find the middle value of a series of +ve integers
            mid = start + (end - start) / 2;

            // hence multiplication may lead to larger values cast to (long)
            if ((long) mid * mid > (long) x) {
                // get the first half of the series
                end = mid - 1;
            } else if (mid * mid == x) {
                // return the center value
                return mid;
            } else {
                // get the second half of the value
                start = mid + 1;
            }
        }
        // round to return perfect integer
        return Math.round(end);
    }

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.sqrt(0));
    }
}
