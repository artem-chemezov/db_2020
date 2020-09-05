package homework.exams_generation;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Examinator exam = new Examinator();


        ExerciseGenerator gen = new ExerciseMinusLessHundred();
        List<Exercise> exercises = exam.generate(15, gen);

        exercises.forEach(System.out::println);
    }
}
