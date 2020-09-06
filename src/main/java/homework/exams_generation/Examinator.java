package homework.exams_generation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public abstract class Examinator {
    protected ExerciseGenerator type;
    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            exercises.add(type.getExercise());
        }
        return exercises;
    }
}
