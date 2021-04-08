package bai7_abstructclass_interface.thuc_hanh.animal_class_interface_edible;

public class AbstructionInterfaceTexts {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        Fruit fruit[]=new Fruit[2];
        fruit[0]=new Orange();
        fruit[1]=new Apple();
        for (Fruit fruits : fruit){
            System.out.println(fruits.howToEat());
        }


        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                iEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
