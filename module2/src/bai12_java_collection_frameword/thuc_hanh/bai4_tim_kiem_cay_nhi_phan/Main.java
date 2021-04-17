package bai12_java_collection_frameword.thuc_hanh.bai4_tim_kiem_cay_nhi_phan;

public class Main {
    public static void main(String[] args) {
        BinarySreachTree<String> tree=new BinarySreachTree<String>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("inoder (sorted : ");
        tree.inorder();
        System.out.println("size"+tree.getSize());
        tree.postorder();

    }
}
