package 练习;

public class Fish extends  Animal implements  pet{
    private String name;
    public void walk(){
        System.out.println("鱼不能走路");
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void play(){
        System.out.println("鱼正在玩耍");
    }
    public Fish(){
        super(0);

    }
    public void eat(){
        System.out.println("鱼正在吃东西");
    }
}
