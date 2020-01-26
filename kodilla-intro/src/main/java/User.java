public class User {

    String user;
    int age;

    public User(String user, int age) {
        this.user = user;
        this.age = age;
    }

    public String returnUser() {
        return this.user;
    }

    public int returnAge() {
        return this.age;
    }

    public static void main(String[] args) {


        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int result = 0;//suma wieku
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].returnAge();
        }

        int averageAge = result / users.length;//średnia wieku userów
        for (int i = 0; i < users.length; i++) {
