package hashmap_hashset_differentiation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //tao cac doi tuong Student
        Student student1 = new Student("Hung", 29, "HN");
        Student student2 = new Student("Tung", 25, "DN");
        Student student3 = new Student("Chung", 28, "DB");
        Student student4 = new Student("Dung", 22, "HCM");
        Student student5 = new Student("Nhung", 27, "QN");

        //luu cac Student vao Map - dung HashMap (dùng put để thêm)
        Map<Integer, Student > studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student4);
        studentMap.put(5, student5);

        //dung For-each de duyet, de cho các đối tượng không bị cùng một dòng
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        //dung HashSet (dùng add để thêm)
        System.out.println("-------");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
