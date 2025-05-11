public class MarjoryElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println("Majority: " + result);
    }

    static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        count = 0;
        for (int num : nums) if (num == candidate) count++;
        return count > nums.length / 2 ? candidate : -1;
    }
}