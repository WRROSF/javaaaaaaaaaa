package 类和对象;

public class TEST {
    public static void main(String[] args){
        HeroType type = HeroType.ASSASSIN;
        switch(type){
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case WIZARD:
                System.out.println("法师");
                break;

        }
        for(HeroType S:HeroType.values()){
            System.out.println(S);

        }






    }


}
