package bai12_java_collection_frameword.bai_tap.bai2_cai_dat_thao_tac_xoa_trong_binary_search_tree;

import bai12_java_collection_frameword.bai_tap.bai2_cai_dat_thao_tac_xoa_trong_binary_search_tree.TreeNode;

public class PostoderTree<E extends Comparable<E>>extends AbstructTree<E>{
    protected TreeNode<E> root;
    protected int size=0;

    public PostoderTree() {

    }
    public PostoderTree(E[] objects){
        for (int i=0; i<objects.length;i++){
            insert(objects[i]);
        }
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public boolean insert(E e) {
        if (root==null) {
            root = createNewNode(e);
        }else {
            TreeNode<E> parent=null;
           TreeNode<E> current=root;
            while (current!=null){
                if (e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                }else if(e.compareTo(current.element)>0){
                    parent=current;
                    current=current.right;
                }else {
                    return false;
                }
            }
            if (e.compareTo(parent.element)<0){
                parent.left=createNewNode(e);
            }else {
                parent.right=createNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public void inorder() {

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postoder() {
        postorder(root);
    }
    public void postorder(TreeNode<E> root){
        if (root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element);

    }
}
