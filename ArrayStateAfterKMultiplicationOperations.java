public class ArrayStateAfterKMultiplicationOperations {

    private static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 1; i <= k; i++) {
            int min = nums[0];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    index = j;
                    min = nums[j];
                }
            }
            nums[index] = min * multiplier;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 5, 6 };
        int k = 5;
        int multiplier = 2;

        int[] result = getFinalState(nums, k, multiplier);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
