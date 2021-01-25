import java.util.*;

public class BOJ_10814 {
    public static class Student {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    public static List<Student> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n; i++){
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Student(age, name));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        for (Student student : list){
            System.out.println(student.age + " " + student.name);
        }
    }
}
