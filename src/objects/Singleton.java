package objects;

public class Singleton {
    int id;
    public static Singleton getInstance() {
        return ourInstance;
    }
    private static Singleton ourInstance = new Singleton();

    public int getID() {
        return id;
    }

    private Singleton() {
        this.id = 1;
    }

    public void test(){
        System.out.println("Singleton"+" "+this.getID());
    }
}
