package homework.exams_generation;

import heroes.Hero;
import homework.exams_generation.exercises.ExercisesDefault;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    private List<ExerciseGenerator> types;

    public List<Exercise> generate(int amount) {
        int quantityOfTypes = types.size();
        int remains = amount % quantityOfTypes;

        List<Exercise> exercises = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            exercises.add(types.get(i % quantityOfTypes).getExercise());
        }
        return exercises;
    }

    public Examinator(ExerciseGenerator... typesOfExercises) {
//        Reflections scanner = new Reflections("homework.exams_generation.exercises");
//        this.types = new ArrayList<ExerciseGenerator>(scanner.get getTypesOf(ExerciseGenerator.class));
//        this.type = new ExercisesDefault();
        if (typesOfExercises.length == 0){
            this.types.add(new ExercisesDefault());
        }
        this.types = List.of(typesOfExercises);
    }
}
