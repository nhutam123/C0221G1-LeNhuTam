import java.util.*;

public class text {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       Queue<String> queue=new LinkedList<String>();
       queue.add("tam");
       queue.add("tam");
       queue.add("tam");
       queue.add("tam");
       queue.add("tam");
       queue.offer("toi");
       String a=scan.nextLine();
       double b=Double.parseDouble(scan.nextLine());
        System.out.println(a);

       for (String e:queue){
           System.out.println(e);
       }

    }
}
