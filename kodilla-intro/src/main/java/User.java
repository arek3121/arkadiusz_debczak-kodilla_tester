public class User {

    String user;
    int age;
    String hobby;

    public User(String user, int age) {
        this.user = user;
        this.age = age;
    }

    public int returnAge() {
        return this.age;
    }
}

