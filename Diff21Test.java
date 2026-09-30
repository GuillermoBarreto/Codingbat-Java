/**
 * Simple verification runner for {@code Exercise1.diff21} (CodingBat Warmup-1).
 *
 * <p>Covers the example calls documented in the README, including the
 * boundary case {@code n == 21}. Compile and run with:
 * {@code javac Exercise1.java Diff21Test.java && java Diff21Test}.
 */
public class Diff21Test {

    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        assertEq(e.diff21(19), 2, "diff21(19)");
        assertEq(e.diff21(10), 11, "diff21(10)");
        assertEq(e.diff21(21), 0, "diff21(21) boundary");
        assertEq(e.diff21(25), 8, "diff21(25)");
        assertEq(e.diff21(30), 18, "diff21(30)");
        System.out.println("All diff21 checks passed.");
    }

    private static void assertEq(int actual, int expected, String label) {
        if (actual != expected) {
            throw new AssertionError(label + ": expected " + expected + " but got " + actual);
        }
    }
}
