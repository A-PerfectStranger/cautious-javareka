public class Sum {
    public static void main(String[] args) {
        int[] list = {3, 3};
        System.out.println(twoSum(list, 6).toString());

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        int i = 0, sum;
        for (int j = 0; j < nums.length; j++) {
           sum = nums[i] + nums[j];
            if (sum == target) {
                sol[0] = i;
                sol[1] = j;
                break;
            }
            i++;
            twoSum(nums, target);
        }
        return sol;
    }

}
