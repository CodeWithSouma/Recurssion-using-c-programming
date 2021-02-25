
public class recurssion {

    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,20};
        var result = firstOccurence(array,0,array.length,60);
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

    // check a given array is sorted or not using recurssion
    // [1,2,3,4,5]
    public static boolean arrayIsSortedOrNot(int [] array, int size){
        if(size == 0 || size == 1) return true;
        
        if(array [size -1] < array[size - 2]) return false;

        return arrayIsSortedOrNot(array, size - 1);
    }

    // print decreasing order
    public static void printDec(int n){
        if(n == 0) return;
        System.out.print(n + " \t");
        printDec(n - 1);
    }
    // print increasing order
    public static void printInc(int n){
        if(n == 0) return;
        printInc(n - 1);
        System.out.print(n + " \t");
    }

    // find first occurence of the key in the array
    public static int firstOccurence(int[] array,int i, int size, int key){
        if(size == i) return -1;
        if(array[i] == key) return i;
        return firstOccurence(array, i + 1, size, key);
    }
    // find last occurence of the key in the array

}