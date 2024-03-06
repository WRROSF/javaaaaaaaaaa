public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void legendary() {
        System.out.println("超神");

    }
    public float getHp() {
        return hp;

    }
    public void recovery(float blood){
        hp = hp+blood;

    }

    }

