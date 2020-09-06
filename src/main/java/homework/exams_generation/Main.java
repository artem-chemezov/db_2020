package homework.exams_generation;

import homework.exams_generation.exercises.ExerciseMinusLessHundred;
import homework.exams_generation.exercises.ExerciseMultiplyingByEight;
import homework.exams_generation.exercises.ExercisesDefault;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Examinator exam = new Examinator(
                new ExerciseMinusLessHundred(),
                new ExerciseMultiplyingByEight(),
                new ExercisesDefault());

        List<Exercise> exercises = exam.generate(15);

        exercises.forEach(System.out::println);
    }
}
