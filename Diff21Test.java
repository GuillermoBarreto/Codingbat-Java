/**
 * Simple verification runner for {@code Exercise1.diff21} (CodingBat Warmup-1).
 *
 * <p>Covers the example calls documented in the README, including the
 * boundary case {@code n == 21}, plus negative input. Compile and run with:
 * {@code javac Exercise1.java Diff21Test.java && java Diff21Test}.
 */
public class Diff21Test {

    private static int failures = 0;

    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        assertEq(e.diff21(19), 2, "diff21(19)");
        assertEq(e.diff21(10), 11, "diff21(10)");
        assertEq(e.diff21(21), 0, "diff21(21) boundary");
        assertEq(e.diff21(25), 8, "diff21(25)");
        assertEq(e.diff21(30), 18, "diff21(30)");
        assertEq(e.diff21(-5), 26, "diff21(-5) negative input");
        if (failures > 0) {
            System.out.println(failures + " diff21 check(s) failed.");
            System.exit(1);
        }
        System.out.println("All diff21 checks passed.");
    }

    private static void assertEq(int actual, int expected, String label) {
        // Count failures instead of throwing: one bad case should not hide
        // the results of the remaining checks.
        if (actual != expected) {
            System.out.println("FAIL " + label + ": expected " + expected + " but got " + actual);
            failures++;
        } else {
            System.out.println("PASS " + label);
        }
    }
}
