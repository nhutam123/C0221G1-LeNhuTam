package bai7_abstructclass_interface.bai_tap.trien_khai_interface_colorable;

public class Text {
    public static void main(String[] args) {
        Square[] squares=new Square[2];
        squares[0]=new Square(2);
        squares[1]=new Square(3);
        for (Square square: squares){
            System.out.println(square);
            square.howToColor();
        }
    }
}
