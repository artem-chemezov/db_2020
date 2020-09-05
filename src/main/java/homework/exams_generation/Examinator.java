package homework.exams_generation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    public List<Exercise> generate(int amount, ExerciseGenerator type) {
        List<Exercise> exercises = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            exercises.add(type.getExercise());
        }
        return exercises;
    }
}
