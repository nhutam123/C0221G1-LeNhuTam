package bai7_abstructclass_interface.bai_tap.trien_khai_interface_resizeable;

public class Square extends Rectangle implements iResizeable{

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
}
