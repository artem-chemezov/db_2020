package homework.exams_generation.exercises;

import homework.exams_generation.Exercise;
import homework.exams_generation.ExerciseGenerator;
import homework.exams_generation.Operator;
import org.decimal4j.util.DoubleRounder;

import java.util.Random;

public class ExerciseMultiplyingByEight implements ExerciseGenerator {

    @Override
    public Exercise getExercise() {
        int preciseA = 2;
        double a = DoubleRounder.round(rand.nextDouble(), preciseA);
        double b = 8.0;
        return new Exercise(a, b, Operator.MULTIPLY);
    }
}
