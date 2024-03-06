public class recovery {
    public static void main(String[] args){
        Hero gailun = new Hero();
        gailun.name = "盖伦";
        gailun.hp =500;
        System.out.println(gailun.name +" 当前的血量是 " +gailun.hp);
        System.out.println("回血100");
        gailun.recovery(100);
        System.out.println("现在的血量是:"+gailun.hp);
    }
}
