public class Grades {

    private int[] grades;
    private int size;
    private int value;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.value = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
       this.grades[this.size] = value;
        this.size++;
    }

    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.getLastGrades();
        grades.getAverage();

        System.out.println(grades.getLastGrades());
        System.out.println(grades.getAverage());

        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(4);
        grades.add(4);
        grades.add(3);
        grades.add(2);
        grades.add(3);
        grades.add(5);
        grades.add(5);


    }
    public int getLastGrades(){
        return 0;//TODO Implemet method
    }

    public double getAverage() {
        int result = 0;
        double average;
        int gradesNumber = grades.length;
        for (int i = 0; i <= 10; i++) {
            result = result + gradesNumber;//TODO Review - wrong calculation
        }
        average = result / grades.length;

        return average;
    }
}
