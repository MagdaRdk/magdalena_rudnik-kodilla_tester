public class SimpleArray {
    public static void main(String [] args) {
        String[] friends = new String[5];
        friends[0] = "Ola";
        friends[1] = "Wojtek";
        friends[2] = "Marzena";
        friends[3] = "Andrzej";
        friends[4] = "Gosia";
        String names = friends[3];
        System.out.println(friends[3]);
        int numberOfElements = friends.length;
        System.out.println(friends.length);
    }
}

