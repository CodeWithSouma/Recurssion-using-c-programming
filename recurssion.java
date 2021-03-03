
public class recurssion {

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
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // find the nth fibonacci number using recurssion
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // check a given array is sorted or not using recurssion
    // [1,2,3,4,5]
    public static boolean arrayIsSortedOrNot(int[] array, int size) {
        if (size == 0 || size == 1)
            return true;

        if (array[size - 1] < array[size - 2])
            return false;

        return arrayIsSortedOrNot(array, size - 1);
    }

    // print decreasing order
    public static void printDec(int n) {
        if (n == 0)
            return;
        System.out.print(n + " \t");
        printDec(n - 1);
    }

    // print increasing order
    public static void printInc(int n) {
        if (n == 0)
            return;
        printInc(n - 1);
        System.out.print(n + " \t");
    }

    // find first occurence of the key in the array
    public static int firstOccurence(int[] array, int i, int size, int key) {
        if (size == i)
            return -1;
        if (array[i] == key)
            return i;
        return firstOccurence(array, i + 1, size, key);
    }

    // find last occurence of the key in the array
    public static int lastOccurence(int[] array, int i, int size, int key) {
        if (size == i)
            return -1;
        int restArray = lastOccurence(array, i + 1, size, key);
        if (restArray != -1)
            return restArray;
        if (array[i] == key)
            return i;
        return -1;
    }

    // Reverse a sttring using recurssion
    public static void reverse(String string) {
        if (string.length() == 0)
            return;
        reverse(string.substring(1, string.length()));
        System.out.print(string.charAt(0));
    }

    // pippppiiiipi replace pi using recurssion
    public static void replacePi(String string) {
        if (string.length() == 0)
            return;
        if (string.charAt(0) == 'p' && string.charAt(1) == 'i') {
            System.out.print("3.14");
            replacePi(string.substring(2, string.length()));
        } else {
            System.out.print(string.charAt(0));
            replacePi(string.substring(1, string.length()));
        }
    }

    // tower of hanoi problem using recurssion 
    public static void towerOfHanoi(int n, char source, char dest, char helper){
        if (n == 0) return;
        towerOfHanoi(n - 1, source, helper, dest);
        System.out.println("Move from " + source + " to " + dest);
        towerOfHanoi(n - 1, helper, dest, source);

    }

    public static void main(String[] args) {
        towerOfHanoi(3,'A','C','B');
        System.out.println();

    }

}