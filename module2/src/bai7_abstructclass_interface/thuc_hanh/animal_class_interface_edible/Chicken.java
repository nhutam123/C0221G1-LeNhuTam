package bai7_abstructclass_interface.thuc_hanh.animal_class_interface_edible;

public class Chicken extends Animal implements iEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck  !";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
