package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    public static Worker generateWorker() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 120001);
        return new Worker(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                salary);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Worker[] generateEmployees(int count) {
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                workers[i] = new Worker("Worker" + i, 15.0); // Генерация объектов класса Worker
            } else {
                workers[i] = new Freelancer("Freelancer" + i, 20.0); // Генерация объектов класса Freelancer
            }
        }
        return workers;
    }    

}
