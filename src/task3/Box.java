package task3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        if (fruits.size()==0) return 0;
        return fruits.size()*fruits.get(0).weight;
    }

    public <B extends Fruit> boolean compare(Box<B> comparedBox){
        return Math.abs(this.getWeight() - comparedBox.getWeight())< 0.001;
    }

    public void transportTo(Box<T> destBox){
        for(T fruit: fruits){
            destBox.addFruit(fruit);
        }
        fruits.clear();
    }



}
