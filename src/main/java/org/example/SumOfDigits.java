package org.example;

public class SumOfDigits {
    public static int digital_root(int n) {
        int root = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        // good explanation https://www.geeksforgeeks.org/digital-rootrepeated-digital-sum-given-integer/
        while (n > 0 || root > 9)
        {
            if (n == 0) {
                n = root;
                root = 0;
            }

            // remainder is what we are looking for
            root += n % 10;
            // then we remove the last digit
            n /= 10;
        }
        return root;
    }

    // Better solution
    public static int digital_root_best(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
    public static int digital_root_best2(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        return(n);
    }
}
