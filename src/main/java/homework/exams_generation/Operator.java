package homework.exams_generation;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Operator {
    PLUS("+"){
        @Override
        double operate(double a, double b) {
            return a + b;
        }
    },MINUS("-") {
        @Override
        double operate(double a, double b) {
            return a - b;
        }
    },MULTIPLY("*") {
        @Override
        double operate(double a, double b) {
            return a * b;
        }
    }, DIVIDE("/") {
        @Override
        double operate(double a, double b) {
            return a / b;
        }
    };

    private final String sign;
    abstract double operate(double a, double b);

}
