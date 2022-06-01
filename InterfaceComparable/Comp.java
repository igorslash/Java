package InterfaceComparable;

import org.jetbrains.annotations.NotNull;

class Compar {
    public static void main(String[] args){
        Animal cat = new Animal("T", 7, 25, 500);
        Animal dog = new Animal("D",30, 18, 700);
        Animal bird = new Animal("B", 16, 11, 1000);
        Animal[] array = {cat, dog, bird};
        for (Animal sort: array) {
            System.out.println(sort.breed);
        }
    }
}
class Animal implements Comparable<Animal> {//interface Comparable сравнение
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    public int compareTo(@NotNull Animal o) {
        int compare = this.speed - o.speed;
        if (compare == 0) {
            return this.price - o.price;
        } else {
            return compare;
        }

    }
}
