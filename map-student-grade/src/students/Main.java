package students;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Alfa");
        Group group = new Group();

        studentA.addGradeToStudent("A", Grade.EXCELLENT);
        studentA.addGradeToStudent("B", Grade.MEDIUM);
        studentA.addGradeToStudent("C", Grade.ACCEPTABLE);
        studentA.addGradeToStudent("D", Grade.GOOD);
        studentA.addGradeToStudent("E", Grade.EXCELLENT);
        studentA.addGradeToStudent("F", Grade.GOOD);
        studentA.addGradeToStudent("G", Grade.FAIL);

        group.addAvgMap(studentA.getName(), Group.getAverageOfStudent(studentA));

        Student studentB = new Student("Beta");

        studentB.addGradeToStudent("A", Grade.GOOD);
        studentB.addGradeToStudent("B", Grade.MEDIUM);
        studentB.addGradeToStudent("C", Grade.ACCEPTABLE);
        studentB.addGradeToStudent("D", Grade.GOOD);
        studentB.addGradeToStudent("E", Grade.MEDIUM);
        studentB.addGradeToStudent("F", Grade.GOOD);
        studentB.addGradeToStudent("G", Grade.FAIL);

        group.addAvgMap(studentB.getName(), Group.getAverageOfStudent(studentB));
        for (String key : Group.getAvgMap().keySet()) {
            System.out.printf("%s student grades' average: %.2f\n", key, Group.getAvgMap().get(key));
        }
    }
}
