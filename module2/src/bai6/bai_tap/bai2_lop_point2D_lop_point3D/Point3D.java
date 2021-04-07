package bai6.baiTap.bai2_lop_point2D_lop_point3D;

public class Point3D extends Point2D {
    private float z=0.0f;
    Point3D(){}
    Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    protected float getZ(){
        return this.z;
    }
    protected void  setZ(float z){
        this.z=z;
    }
    protected float[] getXYZ(){
        float arr[]={super.getX(),super.getY(),getZ()};
        return arr;
    }
    protected void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(1,2,3);
        System.out.println(point3D.toString());
    }
}
