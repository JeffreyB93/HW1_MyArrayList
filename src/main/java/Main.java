import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyAL<Student> list = new MyArrayList<>();
        list.add(new Student(7, "Student_7"));
        list.add(new Student(5, "Student_5"));
        list.add(new Student(6, "Student_6"));
        list.add(new Student(9, "Student_9"));
        list.add(new Student(3, "Student_3"));
        list.add(new Student(1, "Student_1"));
        list.add(new Student(2, "Student_2"));
        list.add(new Student(10, "Student_10"));
        list.add(new Student(15, "Student_15"));

        System.out.println("До сортировки");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        MyCollections.sort(list, Comparator.comparingInt(Student::getId));

        System.out.println("После сортировки");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Student implements Comparable<Student> {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.getId());
    }
}