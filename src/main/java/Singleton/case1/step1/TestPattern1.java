package Singleton.case1.step1;

public class TestPattern1 {
    public static void main(String[] args) {
        Database database;

        database = Database.getInstance("첫번째 데베");
        System.out.println("This is " + database.getName());

        database = Database.getInstance("두번 데베");
        System.out.println("This is " + database.getName());
    }
}
