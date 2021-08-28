package Singleton.case1.step2;

public class Database {
    private static Database singleton;
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

    //synchronized를 통해 Thread시 여러개의 객체가 만들어지는것을 방지
    //but 비용이 비싸다는 문제있
    public synchronized static Database getInstance(String name) {
        if(singleton == null){
            singleton = new Database(name);
        }
        return singleton;
    }

    public String getName() {
        return name;
    }
}
