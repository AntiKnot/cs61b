public class Exercise3 {
    private static int max(int[] n) {
        int maxNum=0;
        for (int i=0; i<n.length; i++) {
            if (n[i]>maxNum) {
                maxNum = n[i];
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
        int ans = max(numbers);
        System.out.println(ans);
    }

}