public class User {
    final String name;
    final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User magda = new User("Magda", 30);
        User ola = new User("Ola", 57);
        User emila = new User("Emila", 4);
        User daniel = new User("Daniel", 32);

        User[] users = {magda, ola, emila, daniel};

        int result = 0;
        double average;
        int userNumber = users.length;
        for (User user : users) {
            result = result + user.age;
        }
        average = result / users.length;

        for (User user : users) {
            if (user.age < average) {
                System.out.println(user.name);
            } else {
                System.out.println("Nobody");
            }
        }
    }
}
