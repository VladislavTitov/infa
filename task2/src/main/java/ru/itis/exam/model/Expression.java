package ru.itis.exam.model;

/**
 * Created by VladislavTitov on 08.06.2017.
 */
public class Expression {

    double first;
    double second;
    String operator;

    public Expression() {
    }

    public Expression(double first, double second, String operator) {
        this.first = first;
        this.second = second;
        this.operator = operator;
    }


    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "first=" + first +
                ", second=" + second +
                ", operator='" + operator + '\'' +
                '}';
    }
}
