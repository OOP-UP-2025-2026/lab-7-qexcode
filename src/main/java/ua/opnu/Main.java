package ua.opnu;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Перевірка Завдання 1
        System.out.println("Чи є 17 простим? " + Lab7Tasks.isPrime.test(17));

        // Перевірка Завдання 2
        Student[] students = {
                new Student("Іван Петренко", "КН-11", new int[]{80, 90, 45}),
                new Student("Марія Іванова", "КН-11", new int[]{100, 99, 98})
        };
        Student[] withDebts = Lab7Tasks.filterStudents(students, Lab7Tasks.hasDebts);
        System.out.println("Студенти з боргами: " + withDebts.length);

        // Завдання 6
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(Lab7Tasks.process(arr, Lab7Tasks.pow2)));

        // Завдання 7
        System.out.println(Arrays.toString(Lab7Tasks.stringify(arr, Lab7Tasks.numToWord)));
    }
}
