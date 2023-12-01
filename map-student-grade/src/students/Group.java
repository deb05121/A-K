package students;

import java.util.HashMap;
import java.util.Map;

public class Group {
    private static Map<String, Double> avgMap;

    public Group() {
        avgMap = new HashMap<>();
    }

    public void addAvgMap(String name, double avg) {
        avgMap.put(name, avg);
    }

    public static Map<String, Double> getAvgMap() {
        return avgMap;
    }

    public static Double getAverageOfStudent(Student student) {
        double sum = 0;
        double avg;
        for (Map.Entry<String, Grade> entry : student.getGradeMap().entrySet()) {
            sum += entry.getValue().getValue();
        }

        avg = sum / student.getGradeMap().size();
        avgMap.put(student.getName(), avg);
        return avg;
    }

}
