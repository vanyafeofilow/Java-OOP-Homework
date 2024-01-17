package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
import java.util.Comparator;

public class Freelancer implements Comparable<Freelancer> {
    private String name;
    private double hourlyRate;

    public Freelancer(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public double calculateMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public int compareTo(Freelancer other) {
        return Double.compare(this.calculateMonthlySalary(), other.calculateMonthlySalary());
    }

    public static class HourlyRateComparator implements Comparator<Freelancer> {
        @Override
        public int compare(Freelancer freelancer1, Freelancer freelancer2) {
            return Double.compare(freelancer1.getHourlyRate(), freelancer2.getHourlyRate());
        }
    }
}

