// Tribonacci series ----------------------Time Complexity(O-2^n)
class Main{
    public static int fib(int n){
        if(n==0 ){
            return 0;
        }if(n<=2){
            return 1;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibnm3=fib(n-3);
        int fibnth=fibnm1+fibnm2+fibnm3;
        return fibnth;
    }
    public static void main(String[]args){
        int n=5;
        System.out.println(fib(n));
    }
}

//Optimized Tribonacci series -------------Time complexity(O-n)
class Main {
    public static int fib(int n, int[] dp) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        // return stored value if already calculated
        if (dp[n] != -1) {
            return dp[n];
        }

        // compute and store result
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp) + fib(n - 3, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];

        // initialize dp array with -1
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println(fib(n, dp));
    }
}













