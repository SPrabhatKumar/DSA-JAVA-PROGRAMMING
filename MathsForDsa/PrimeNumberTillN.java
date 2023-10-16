public class PrimeNumberTillN {
    public static void main(String[] args) {
        int n = 50;
        boolean prime[] = new boolean[n + 1];
        isPrime(n, prime);
        // System.out.println(prime[0]);
    }
    // sieve of erostothenes
    public static void isPrime(int n, boolean prime[]) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
