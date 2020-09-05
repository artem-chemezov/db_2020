package homework.exams_generation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private double a;
    private double b;
    private double answer;
    private Operator operator;

    public Exercise(double a, double b, Operator operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
        this.answer = operator.operate(a,b);
    }
}