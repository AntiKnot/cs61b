public class DogLoop {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Dog small = new Dog(9);
        Dog medium = new Dog(20);
        Dog large = new Dog(100);
        dogs[0] = small;
        dogs[1] = medium;
        dogs[2] = large;
        int i = 0;
        while (i < dogs.length) {
            Dog.maxDog(dogs[i], medium).makeNoise();
            i = i + 1;
        }
    }
}