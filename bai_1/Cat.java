package bai_1;

public class Cat extends Animals{
    private String furColor;

    //constructor
    public Cat(String name, int age, String furColor){
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound(){
        return "Meow Meow";
    }
}
