package bai7_abstructclass_interface.bai_tap.trien_khai_interface_colorable;

public class Square implements Colorable {
    private double side;
    @Override
    public void howToColor() {
        System.out.println("color all four sides");
    }
    Square(){}
    Square(double side){
    this.side=side;
    }
    double getSide(){
        return this.side;
    }
    double getArea(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+
                "area="+ getArea();
    }

    public static void main(String[] args) {
        Square newsquare=new Square(4);
        newsquare.howToColor();
    }


}
