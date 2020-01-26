public class User {

    String user;
    int age;
    String hobby;

    public User(String user, int age, String hobby) {
        this.user = user;
        this.age = age;
        this.hobby = hobby;
    }

    public String returnUser() {
        return this.user;
    }

    public int returnAge() {
        return this.age;
    }

    public static void main(String[] args) {

        User user1 = new User("Anna",  20, "pilka");
        User user2 = new User("Betty", 33, "pilka");
        User user3 = new User("Carl", 58, "pilka" );
        User user4 = new User("David", 13, "pilka");
        User user5 = new User("Eva", 18, "pilka");
        User user6 = new User("Frankie", 45, "pilka");

        User[] users = {user1, user2, user3, user4, user5, user6};

        int result = 0;//suma wieku
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].returnAge();
        }

        int averageAge = result / users.length;//średnia wieku userów

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].user);
            }
        }
    }
}

