package bai14_thuat_toan_sap_xep.bai_tap.bai2_minh_hoa_sap_xep_chen;

public class MinhHoaInsertionSort {
    public static void main(String[] args) {
        int[] list={8,6,7,3,5,4,2,1,9,15,34};
        minhHoa(list);
    }
    public static void minhHoa(int[] list){
        int length=list.length;
        int key;
        int k=1;

        for (int i=1;i<length;i++){

            key=list[i];
            int j=i-1;


            while (j>=0 && list[j]>key){
                list[j+1]=list[j];
                j=j-1;
            }
            list[j+1]=key;
            System.out.println("bước : "+ k++);
            printList(list);
            System.out.println();
        }
    }
    static  void  printList(int[] arr){
        int i;

        int length=arr.length;
        for ( i=0;i<length;i++){
            System.out.print(arr[i]);
        }
    }
}
