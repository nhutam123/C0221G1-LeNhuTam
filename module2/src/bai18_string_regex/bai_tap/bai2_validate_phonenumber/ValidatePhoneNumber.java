package bai18_string_regex.bai_tap.bai2_validate_phonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String PHONE_NUMBER="\\([0-9]{2}\\)-\\(0[0-9]{9}\\)";


    public ValidatePhoneNumber() {
    }

    public boolean validate(String input){
        Pattern pattern=Pattern.compile(PHONE_NUMBER);
        Matcher matcher=pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ValidatePhoneNumber validatePhoneNumber=new ValidatePhoneNumber();
        System.out.println("nhập vào số điện thoại");
        String input=scanner.nextLine();
        System.out.println(validatePhoneNumber.validate(input));
    }

}
