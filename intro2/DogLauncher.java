public class DogLauncher {
    public static void main(String[] args) {
        Dog dog = new Dog(25);
        dog.makeNoise();
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(28);
        dogs[0].makeNoise();
        dogs[1].makeNoise();
        Dog bigger = Dog.maxDog(dogs[0],dogs[1]);
        bigger.makeNoise();
        Dog max = dogs[0].maxDog(dogs[1]);
        max.makeNoise();
        System.out.println(Dog.binomen);
    }
}