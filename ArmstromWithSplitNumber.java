package design.test;

public class ArmstromWithSplitNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrom(153));
    }
    public static boolean isArmstrom(int n){

        int rev=0, t=n;
        while (t!=0){
            rev = rev+ (int) Math.pow((t%10),3);
            t=t/10;
        }
        System.out.println(rev);
        System.out.println(n);
        return (rev==n)?true:false;
    }
}
