package interfaceComparator;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

class Comparat {
    public static void main(String[] args) {
        Animal pig = new Animal("P", 7, 25, 500);
        Animal dog = new Animal("D", 30, 18, 700);
        Animal bird = new Animal("B", 16, 11, 1000);
        Animal[] array = {pig, dog, bird};
        Arrays.sort(array, new Comparator<Animal>() {//lambda -> o1.price - o2.price
            //  new Comparator вызов компаратора
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }
        });
        for (Animal sort : array) {
            System.out.println(sort.price);
        }
        Arrays.sort(array, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return  o1.breed.compareTo(o2.breed);
            }
        });
        for (Animal sort : array) {
            System.out.println(sort.breed);
        }
        

    }
}
class Animal {
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

}
//  Более длинная реализация
class ComparatorPrice implements Comparator<Animal> {
    @Override
    public int compare(@NotNull Animal o1, @NotNull Animal o2) {
        return o1.price - o2.price;
    }
}
class ComparatorSpeed implements Comparator<Animal> {
    @Override
    public int compare(@NotNull Animal o1, @NotNull Animal o2) {
        return o1.speed - o2.speed;
    }
}
class ComparatorBreed implements Comparator<Animal> {
    @Override
    public int compare(@NotNull Animal o1, @NotNull Animal o2) {
        return o1.breed.compareTo(o2.breed);
    }
}
