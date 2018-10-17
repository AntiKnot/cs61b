import java.util.Arrays;
/** Test the Sort class. */
public class TestSort {
    /** Test Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "i", "have"};
        Sort.sort(input);

        // if (input != expected) {
        //     System.out.println("Error! There seems to be a problem with Sort.sort.");
        // }
        // if (Arrays.equals(input, expected)) {
        //     System.out.println("Error! There seems to be a problem with Sort.sort.");
        // 
        for (int i=0; i<input.length; i+=1) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i +", expected: " + expected[i] + ", but got: " + input[i]);
                return;
            }
        }

    }
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";
        String actual = Sort.findSmallest(input);

        if (!expected.equals(actual)) {
                System.out.println("Not smallest.");
        }
    }
    public static void main(String[] args) {
        testSort();
    }
}