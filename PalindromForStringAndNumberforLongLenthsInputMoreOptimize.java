package design.test;

public class PalindromForStringAndNumberforLongLenthsInputMoreOptimize {
    public static void main(String[] args) {
       String name = "bob";
       System.out.println(name);
       System.out.println(isPalForString(name));

       System.out.println("-----------------------------------------------");
       System.out.println(isPalForNumber(109999));
       System.out.println("-----------------------------------------------");
       System.out.println(isPalForNumberUsingStringBuffer(101));

        isPalForStringMoreOptimize("bob");



    }

    public static boolean isPalForString(String name) {
        String result = "";
        for (int i = (name.length() - 1); i >= 0; i--)
            result = result + name.charAt(i);
        System.out.println(result);
        if (result.equals(name))
            return true;
        else
            return false;

    }

    public static boolean isPalForNumber(int number) {
        int reverseNo = 0, temp = number;
        while (temp != 0) {
            reverseNo = (reverseNo * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverseNo == number) ? true : false;
    }

    public static boolean isPalForNumberUsingStringBuffer(int number) {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        String rev = stringBuffer.reverse().toString();

        return (rev.equals(String.valueOf(number))) ? true : false;
    }


    public static void isPalForStringMoreOptimize(String str) {

     char[] strArr=str.toCharArray();
     char start,end;
        for(int i=0; i<=((str.length()/2)-1);i++){

            start=strArr[i];
            end=strArr[(strArr.length-1)-i];
            strArr[i]=end;
            strArr[(strArr.length-1)-i]=start;
        }
        System.out.println(str.getClass());
        System.out.println(strArr.toString().getClass());
        System.out.println(str.equals(String.valueOf(strArr)));

    }

   


}
