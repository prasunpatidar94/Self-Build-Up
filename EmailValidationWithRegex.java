package design.test;

import java.util.Arrays;
import java.util.regex.Pattern;

public class EmailValidationWithRegex{

    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(10,30,56,7,84,125);
//
//        System.out.println(numbers.stream().filter(e->e%3!=0).collect(Collectors.toList()));


        String email1 = "Prasunpatidar94@gmail.com";
        String email2 = "8788787867atidar@gamil.com";
        String email3 = null;

        System.out.println("first : " + validationEmailId(email1));
        System.out.println("second : " + validationEmailId(email2));
        System.out.println("Three : " + validationEmailId(email3));

    }

    public static Boolean validationEmailId(String email) {

        if (email == null || email.isBlank() || email.isEmpty() )
        return false;
        else{                      //Prasun.Patidar@ibm.com
            String emailRegexExp = "[A-Za-z0-9_/./-]+[@][a-z]{3,}[/.][a-z]{2,3}";
            Pattern pattern = Pattern.compile(emailRegexExp);
            if (pattern.matcher(email).matches())
                return true;
            else
                return false;
        }
    }
}
