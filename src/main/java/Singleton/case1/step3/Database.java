package Singleton.case1.step3;

public class Database {
    //비싼 synchronized사용할 필요X
    private static Database singleton = new Database("products");
    private String name;

    private Database(String name) {
//        super();
//        this.name = name;
        try{
            Thread.sleep(100);
            this.name = name;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance(String name) {
        return singleton;
    }

    public String getName() {
        return name;
    }
}
