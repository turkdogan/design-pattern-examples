/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class SingletonExample {

    public static void main(String[] args) {
        DBManager instance1 = DBManager.getInstance();
        DBManager instance2 = DBManager.getInstance();

        System.out.println("Should print true (two instances are same reference): " +
                           (instance1 == instance2));
    }
}

/**
   A simple, but probabaly not the best Singleton example!
   Consider private constructor and final instance variable
*/
class DBManager {

    private static final DBManager instance = new DBManager();

    private DBManager() {
        // private constructor!
    }

    public static DBManager getInstance() {
        return instance;
    }
}
