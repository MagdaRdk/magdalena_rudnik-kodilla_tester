public class User {
    String name;
    int age;

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
        for( int i = 0; i<.......length; i++)    {
            result = result + numbers[i]; /* nie wiem jak zmodyfikować ten kod , aby korzystał z elementów tablicy User orz w ciele pętli brał wartość pola wiek każdego użytkownika. Proszę o podpowiedź.*/
        }
        int average  = result / numbers.length;

        for ( int); { /* nie wiem jakie warunki tu wpisać. Proszę o pomoc*/
            if( this.age < average) {
                System.out.println(this.name) {
                } else {
                    System.out.println("Nobody");
                }
            }
        }
    }
}