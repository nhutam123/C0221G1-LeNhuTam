package bai18_string_regex.bai_tap.bai1_validate_classname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String[] vali=new String[]{"C0318G","M0318G","P0323A"};
    public static final String CLASS_NAME="^[CAP][0-9]{4}[GHIKLM]$";

    public Validate() {
    }
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(CLASS_NAME);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Validate validate=new Validate();
        for (String va:vali){
            boolean isval=validate.validate(va);
            System.out.println(isval);
        }


    }
}
