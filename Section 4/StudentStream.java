import java.util.ArrayList;
import java.util.Comparator;

public class StudentStream {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Stacy",4.7,10));
        students.add(new Student("George", 3.2, 17));
        students.add(new Student("Alex", 5.0, 25));
        students.add(new Student("Miles",4.0,1));
        students.add(new Student("Monica", 0.0, 0));
        students.stream()
                .sorted(Comparator.comparing(Student::getAverage))
                .forEach(s->System.out.println(s.getName()));
        students.stream()
                .sorted((s1,s2)->{
                    return s1.getName().length() - s2.getName().length();
                })
                .forEach(s->System.out.println("Sorted by length: " + s.getName()));
        students.stream()
                .sorted(Comparator.comparing(Student::getNumClassesTaken))
                .forEach(s->System.out.println("Sorted by classes taken: "+s.getName()));

    }
}
class Student{
    String name;
    double average;
    int numClassesTaken;

    public Student(String name, double average, int numClassesTaken) {
        this.name = name;
        this.average = average;
        this.numClassesTaken = numClassesTaken;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public int getNumClassesTaken() {
        return numClassesTaken;
    }
}