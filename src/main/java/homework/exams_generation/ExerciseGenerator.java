package homework.exams_generation;

import java.util.Random;

public interface ExerciseGenerator {
    Random rand = new Random();
    Exercise getExercise();
}
