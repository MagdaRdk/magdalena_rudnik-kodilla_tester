public class Grades {

    private int[] grades ;
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

    public int getLastGrades() {
        int [] grades = {5,4,3,4,4,3,2,3,5,5};
        int size = grades.length;
        return grades[size-1];
    }

    public double getAverage() {
        int [] grades = {5,4,3,4,4,3,2,3,5,5};
        int result = 0;
        double average;
        int gradesNumber = grades.length;
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
        }
        average = result / grades.length;
        return average;
    }
}

