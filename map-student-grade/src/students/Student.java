package students;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String name;
    private final Map<String, Grade> gradeMap;

    public Student(String name) {
        this.name = name;
        this.gradeMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Grade> getGradeMap() {
        return gradeMap;
    }

    public void addGradeToStudent(String key, Grade grade) {
        this.gradeMap.put(key, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "gradeMap : " + gradeMap.values() +
                '}';
    }
}
