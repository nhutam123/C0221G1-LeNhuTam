package bai12_java_collection_frameword.bai_tap.bai2_cai_dat_thao_tac_xoa_trong_binary_search_tree;

public interface Tree<E> {
    public boolean insert(E e);
    public void  inorder();
    public int getSize();
    public void postoder();
}
