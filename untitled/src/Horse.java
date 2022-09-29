public class Horse extends Animal{
    String name;
    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }
    public void letsgo() {
        System.out.println("Вперед, " + name + "!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }

    @Override
    public void eat() {
        System.out.println("Лошадка ест");
    }
}