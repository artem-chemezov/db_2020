package homework.exams_generation;

import org.decimal4j.util.DoubleRounder;

public class ExerciseMinusLessHundred implements ExerciseGenerator {
    @Override
    public Exercise getExercise() {
        int preciseA = 2;
        int preciseB = 2;
        double a = DoubleRounder.round(rand.nextDouble(), preciseA);
        double b = DoubleRounder.round(rand.nextDouble(), preciseB);
        return new Exercise(a, b, Operator.MINUS);
    }
}
