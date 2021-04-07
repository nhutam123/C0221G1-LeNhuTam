package bai5.thucHanh.thucHanh4;

public class Person {
    private String name;
    protected Person(){}
    Person(String name){
        this.name=name;
    }
    protected String getName(){
        return this.name;
    }
    protected void setName(String newName){
         this.name=newName;
    }
}
