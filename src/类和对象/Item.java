package 类和对象;

public class Item {
    String name;
    int price;
    private Item(){


    }
    public static Item instance;

    public static Item getInstance(){
        if(instance==null){
            instance = new Item();
        }
        return instance;

    }

}
