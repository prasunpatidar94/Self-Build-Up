package design.test;

public class FectorialByUsingWhile {
    public static void main(String[] args) {

        System.out.println(getFectorial(5));

    }

    public static int getFectorial(int number){
        int res=1;
        while(number>=1){
            res=res*number;
            number--;
        }

        return res;
    }
}
