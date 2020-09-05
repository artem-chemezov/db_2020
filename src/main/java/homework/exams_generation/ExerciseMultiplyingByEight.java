package homework.exams_generation;

import org.decimal4j.util.DoubleRounder;

import java.util.Random;

public class ExerciseMultiplyingByEight implements ExerciseGenerator{

    @Override
    public Exercise getExercise() {
        int preciseA = 2;
        double a = DoubleRounder.round(rand.nextDouble(), preciseA);
        double b = 8.0;
        return new Exercise(a, b, Operator.MULTIPLY);
    }
}
