public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, target, 0, 0);
    }

    private int findTargetSumWays(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }
        return findTargetSumWays(nums, target, index + 1, sum + nums[index]) +
                findTargetSumWays(nums, target, index + 1, sum - nums[index]);
    }

    public static void main(String[] args) {
        TargetSum dayOneLeet = new TargetSum();
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(dayOneLeet.findTargetSumWays(nums, target));
    }
}
