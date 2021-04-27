package bai18_string_regex.thuc_hanh.bai1;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validateEmail=new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidateEmail=new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        emailExample=new EmailExample();
        for (String email : validateEmail){
            boolean isvalid=emailExample.validate(email);
            System.out.println("Email is "+ email+ "is valid "+isvalid);

        }
        for (String email: invalidateEmail){
            boolean isvalid=emailExample.validate(email);
            System.out.println(" Email is "+ email+" is valid "+isvalid);
        }

    }
}
