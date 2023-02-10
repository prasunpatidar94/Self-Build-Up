package design.test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesWithWhileLoop {

    public static void main(String[] args) {

        int first=0,second=1,three,n=10,count=0;
        List<Integer> list = new ArrayList<>();

        while(count<=10){
            list.add(first);
            three=first+second;
            first=second;
            second=three;
            count++;
        }

        System.out.println(list);

    }
}
