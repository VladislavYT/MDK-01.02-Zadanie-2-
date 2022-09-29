public class Main {
    public static void main(String[] msi) {
        Veterinar veterinar = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Бобик", "Мясо","Магазин");
        animals[1] = new Cat("Барсик", "Рыба", "Магазин");
        animals[2] = new Horse("Игоооорь", "трава", "Поле");

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
    }
}