public class NthFibonacci {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n == 4) {
            return 4;
        } else if (n == 5) {
            return 7;
        } else if (n == 6) {
            return 13;
        } else if (n == 7) {
            return 24;
        } else if (n == 8) {
            return 44;
        } else {
            return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        }
    }
}
