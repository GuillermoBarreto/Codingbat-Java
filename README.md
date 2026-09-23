# CodingBat-Java

Java solutions to CodingBat exercises, worked one at a time.

## Exercise 2 — `diff21` (Warmup-1)

> Given an int `n`, return the absolute difference between `n` and 21,
> except return double the absolute difference if `n` is over 21.

### Examples

| Call          | Result | Why                          |
|---------------|--------|------------------------------|
| `diff21(19)`  | 2      | 21 − 19                      |
| `diff21(10)`  | 11     | 21 − 10                      |
| `diff21(21)`  | 0      | exact match                  |
| `diff21(25)`  | 8      | (25 − 21) × 2, over 21       |
| `diff21(30)`  | 18     | (30 − 21) × 2, over 21       |

### Solution

See [`Exercise1.java`](Exercise1.java). The boundary case `n == 21` returns `0`
from the `n <= 21` branch, so no special-casing is needed.

### Verify

Paste the method into the [CodingBat Java editor](https://codingbat.com/java/Warmup-1)
for `diff21` and run the built-in tests, or check the example calls above by hand.
