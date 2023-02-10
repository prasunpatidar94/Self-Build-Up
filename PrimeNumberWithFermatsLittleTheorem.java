package design.test;

public class PrimeNumberWithFermatsLittleTheorem {
    public static void main(String[] args) {


//        for (int i = 0; i < 100; i++) {
//            System.out.print(isPrimeValue(i) ? i + ", " : "");
//        }

        int n= 99;
        System.out.print(isPrimeValue(n));
    }

    public static boolean isPrimeValue(Integer n) {

        if (n == 0 || n == 1 ) {
            return false;
        }
        if ( n == 2) {
            return true;
        }
        if ( n%2==0) {
            return false;
        }
        else
        {
            Integer p = (2^n-1)%n;
            if (p==1)
                return true;
            else
                return false;
        }


    }
}
