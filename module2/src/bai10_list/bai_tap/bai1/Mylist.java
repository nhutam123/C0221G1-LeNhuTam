package bai10_list.bai_tap.bai1;

import java.util.Arrays;
import java.util.Objects;

public class Mylist<E> {
    int size=0;
    static  final  int DEFAULT_CAPACITY=10;
   private  Object elements[];
    Mylist(){}
    Mylist(int capacity){
        elements=new Object[capacity];
        }

    public void ensureCapacity(){
      int newSize=elements.length*2;
      elements= Arrays.copyOf(elements,newSize);
    }

     void add(int index, E element ){
        if (size==elements.length){
            ensureCapacity();
        }

        for (int i=size-1;i>=index;i--){
            elements[i+1]=elements[i];
        }
        elements[index]=element;
        size++;
    }
    public E remove(int index){
      E element= (E) elements[index];
        for (int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;

    }
    int size(){
        return size;
    }
//    public E clone(){
//        Object elementsClone=new Objects[DEFAULT_CAPACITY];
//        elementsClone=Arrays.
//        return elementsClone;
//    }
    boolean contains(E element){
        int count=0;
        for (int i=0;i<size ;i++){
            if (element==elements[i]){
                count++;
            }
        }
        if (count==0){
            return false;
        }else {
            return true;
        }
    }
    int indexOf(E element){
        int result=-1;
        for (int i=0;i<size;i++){
            if (element==elements[i]){
                result=i;
            }
        }
        return result;
    }


    public E get(int i){
       return (E) elements[i];

    }
    public void clear(){
       for (int i=0;i<size;i++){
           elements[i]=0;
       }
       size=0;

    }

}
