package homework.exams_generation.exercises;

import homework.exams_generation.Exercise;
import homework.exams_generation.ExerciseGenerator;
import homework.exams_generation.Operator;
import org.decimal4j.util.DoubleRounder;

public class ExercisesDefault implements ExerciseGenerator {

    @Override
    public Exercise getExercise() {
        int preciseA = 2;
        int preciseB = 2;
        double a = DoubleRounder.round(rand.nextDouble(), preciseA) * 100;
        double b = DoubleRounder.round(rand.nextDouble(), preciseB) * 100;
        return new Exercise(a, b, Operator.PLUS);
    }
}
