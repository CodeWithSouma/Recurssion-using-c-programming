public class recurssion {

    public static void main(String[] args) {
        int result = fibonacci(5);
        System.out.println(result);
        
    }

    // sum of n natural number
    public static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    // print 1 to 10 using recurssion
    public static void print(int n) {
        if (n == 0)
            return;

        print(n - 1);
        System.out.print(n + "\t");
    }

    // n^p using recurssion
    public static int power(int n, int p) {
        if (p == 1)
            return n;

        return n * power(n, p - 1);
    }

    // factorial of n claculate using recurssion
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    // find the nth fibonacci number using recurssion   
    public static int fibonacci(int n){
        if (n == 0 || n == 1) 
            return n;
  
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}