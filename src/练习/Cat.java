package 练习;

public class Cat extends Animal implements pet {
    private String name;
    public Cat(String name){
        super(2);
        this.name = name;

    }
    public Cat(){

        this("");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public void play(){
        System.out.println("猫正在玩耍");

    }
    public void eat(){
        System.out.println("蜘蛛正在吃东西");
    }



}
