public class Cat extends Animal{
    String name;
    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }
    public void Gosleep() {
        System.out.println("Наелся и спит");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }
}