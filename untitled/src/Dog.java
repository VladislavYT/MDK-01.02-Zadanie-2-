public class Dog extends Animal{
    String name;
    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }
    public void trick() {
        System.out.println("Дал лапу");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
}