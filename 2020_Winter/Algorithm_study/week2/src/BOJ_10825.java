import java.util.*;

public class BOJ_10825 {

    public static class Student {
        String name;
        int korean;
        int english;
        int math;
        public Student(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }

    public static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            list.add(new Student(name, korean, english, math));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.korean == o2.korean && o1.english == o2.english && o1.math == o2.math)
                    return o1.name.compareTo(o2.name);
                else if (o1.korean == o2.korean && o1.english == o2.english)
                    return o2.math - o1.math;
                else if (o1.korean == o2.korean) {
                    return o1.english - o2.english;
                }
                else{
                    return o2.korean - o1.korean;
                }
            }
        });

        for (Student val : list){
            System.out.println(val.name);
        }
    }
}
