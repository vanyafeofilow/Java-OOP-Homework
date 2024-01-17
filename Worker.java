package ru.geekbrains.oop.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {

    @Override
    public double calculateSalary() {
        return salary;
    }

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f руб.",
                surName, name, calculateSalary());
    }
}
