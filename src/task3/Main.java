package task3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();


        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Orange> orangeBox3 = new Box<>();

        appleBox1.transportTo(appleBox2);


        for(int i = 0; i < 9; i++) appleBox1.addFruit(new Apple());
        for(int i = 0; i < 10; i++) appleBox2.addFruit(new Apple());
        for(int i = 0; i < 6; i++) orangeBox1.addFruit(new Orange());
        for(int i = 0; i < 33; i++) orangeBox2.addFruit(new Orange());
        for(int i = 0; i < 21; i++) orangeBox3.addFruit(new Orange());

        System.out.println(appleBox1.compare(orangeBox1));


    }
}
