public class Dog {
    public int WeightInPounds;
    public static String binomen = "Canis familiaris";

    /* One interger Constructor for dogs. */
    public Dog(int w) {
        WeightInPounds = w;
    }

    public void makeNoise(){
        if (WeightInPounds < 10) {
            System.out.println("yip!");
        } else if (WeightInPounds < 30){
            System.out.println("barks!");
        } else {
            System.out.println("Wooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.WeightInPounds > d2.WeightInPounds) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2) {
        if (this.WeightInPounds > d2.WeightInPounds) {
            return this;
        }
        return d2;
    }
}