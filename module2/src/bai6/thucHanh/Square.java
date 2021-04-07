package bai6.thucHanh;

public class Square extends Rectangle {
    private double side;
    Square(){
        double side;
    }
    Square(double side){
        this.side=side;
    }
    Square(double side,String color, boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }
    private double getSide(){
        return this.side;
    }
    private void setSide(double side){
        this.side=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {
        Square newSquare=new Square(1,"blue",false);
        System.out.println(newSquare);
    }
}
