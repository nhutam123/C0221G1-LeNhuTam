package bai5.thucHanh.thucHanh1;

public class AccessModifier {
    private int data=40;
    private void message(){

        System.out.println("hello java");

    }

    public static void main(String[] args) {
        AccessModifier accessModifier1=new AccessModifier();
        System.out.println(accessModifier1.data);
        accessModifier1.message();
    }
}
