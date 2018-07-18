package jUnitTask;

import static jUnitTask.QEquation.qEquation;

public class ExecutionQequation {
    public static void main(String[] args) {
        QEquation.Pair result = qEquation(1, 7, 12);
        System.out.println(result.first);
        System.out.println(result.second);
    }
}
