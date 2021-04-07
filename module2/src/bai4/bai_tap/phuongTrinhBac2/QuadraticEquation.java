package bai4.baiTap.phuongTrinhBac2;

public class QuadraticEquation {
int a;
int b;
int c;

 double r1;
 double r2;
  public  QuadraticEquation(int a,int b,int c){
   this.a=a;
   this.b=b;
   this.c=c;
  }
   public double getDiscriminant(){
      return  b*b-4*a*c;
    }
    public  double getRoot1(){
          return r1 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public  double getRoot2(){
          return r2 = (-b + Math.sqrt(getDiscriminant())) / (a * 2);
    }
}

