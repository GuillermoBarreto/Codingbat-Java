/**
 * CodingBat Warmup-1 — diff21.
 *
 * <p>Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.</p>
 *
 * <p>Examples:</p>
 * <ul>
 *   <li>{@code diff21(19)} &rarr; 2</li>
 *   <li>{@code diff21(10)} &rarr; 11</li>
 *   <li>{@code diff21(21)} &rarr; 0</li>
 *   <li>{@code diff21(25)} &rarr; 8</li>
 *   <li>{@code diff21(30)} &rarr; 18</li>
 * </ul>
 */
public class Exercise1 {

    /**
     * Returns the absolute difference between {@code n} and 21,
     * doubled when {@code n} is over 21.
     *
     * @param n the input number
     * @return the (possibly doubled) absolute difference from 21
     */
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }
}
