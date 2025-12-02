class Main{
    public static int fib(int n){
        if(n==0 ){
            return 0;
        }if(n<=2){
            return 1;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibnth=fibnm1+fibnm2;
        return fibnth;
    }
    public static void main(String[]args){
        int n=5;
        System.out.println(fib(n));
    }
}
