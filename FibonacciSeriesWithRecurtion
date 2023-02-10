package design.test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesWithRecurtion {

    public static void main(String[] args) {

        List<Integer> ser1= new ArrayList<>();
        int n= 10;
        for (int i = 0; i <=n ; i++) {
            ser1.add(reqFun(i));
        }
        System.out.println(ser1);
    }
    public static Integer reqFun(int no){
        if (no<=1)
            return no;
        else
            return reqFun(no-2)+reqFun(no-1);
    }
}
