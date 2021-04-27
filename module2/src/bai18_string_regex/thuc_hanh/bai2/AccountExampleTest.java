package bai18_string_regex.thuc_hanh.bai2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validateAcount=new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidateAcount=new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample=new AccountExample();
        for (String acount: validateAcount){
            boolean isvalid=accountExample.validate(acount);
            System.out.println("Account is " + acount +" is valid: "+ isvalid);
        }
        for (String acount: invalidateAcount){
            boolean isvalid=accountExample.validate(acount);
            System.out.println("Account is " + acount +" is valid: "+ isvalid);
        }
    }
}
