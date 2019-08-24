

public class ClassificationRandom {
    public static void main(String[] agrs) {
        int nums[] = new int[25];
        for (int i = 0; i < 25; i++)
            nums[i] = (int) (Math.random() * 100);

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] < nums[j + 1]) {
                System.out.println(nums[j] + " is smaller than " + nums[j + 1]);
            } else if (nums[j] > nums[j + 1]) {
                System.out.println(nums[j] + " is bigger than " + nums[j + 1]);
            } else {
                System.out.println(nums[j] + " is equal to " + nums[j + 1]);
            }
        }
    }
}