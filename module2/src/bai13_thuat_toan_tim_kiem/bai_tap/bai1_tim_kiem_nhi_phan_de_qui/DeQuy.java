package bai13_thuat_toan_tim_kiem.bai_tap.bai1_tim_kiem_nhi_phan_de_qui;

public class DeQuy {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,12,13,25,27};
        int key=10;
        int right=arr.length;
        System.out.println(search(arr,key,0,right));
    }

    static int search(int[] arr,int key,int left,int right){
        int mid=(left+right)/2;
        if (right>left){
            if (arr[mid]==key){
                return mid;
            }else if (arr[mid]>key){
                return search(arr,key,left,mid-1);
            }else {
                return search(arr,key,mid+1,right);
            }
        }
        return -1;
    }
}
