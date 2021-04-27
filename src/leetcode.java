
public class leetcode {
    //c
    public static void main(String[] args) {
        System.out.println("hello leetcode");
        leetcode1 leetcode1 = new leetcode1();
        int[] arr = {2,7,11,15};
        int[] ints = leetcode1.twoSum(arr, 9);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
