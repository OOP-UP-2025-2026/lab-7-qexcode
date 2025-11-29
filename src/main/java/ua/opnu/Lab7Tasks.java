package ua.opnu;

import java.util.*;
import java.util.function.*;

public class Lab7Tasks {

    // ------------ Завдання 1 ------------
    public static Predicate<Integer> isPrime = n -> {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    };

    // ------------ Завдання 2 ------------
    public static Student[] filterStudents(Student[] students, Predicate<Student> cond) {
        List<Student> result = new ArrayList<>();

        for (Student s : students) {
            if (cond.test(s)) result.add(s);
        }
        return result.toArray(new Student[0]);
    }

    public static Predicate<Student> hasDebts = s -> {
        for (int m : s.getMarks()) {
            if (m < 60) return true;
        }
        return false;
    };

    // ------------ Завдання 3 ------------
    public static <T> List<T> filterTwo(T[] arr, Predicate<T> p1, Predicate<T> p2) {
        List<T> result = new ArrayList<>();
        for (T t : arr) {
            if (p1.test(t) && p2.test(t))
                result.add(t);
        }
        return result;
    }

    // ------------ Завдання 4 ------------
    public static Consumer<Student> printFullName = s -> {
        String[] parts = s.getName().split(" ");
        System.out.println(parts[0] + " " + parts[1]);
    };

    public static void forEachStudents(Student[] students, Consumer<Student> action) {
        for (Student s : students) action.accept(s);
    }

    // ------------ Завдання 5 ------------
    public static void applyIf(int[] arr, Predicate<Integer> p, Consumer<Integer> c) {
        for (int n : arr) {
            if (p.test(n)) c.accept(n);
        }
    }

    // ------------ Завдання 6 ------------
    public static Function<Integer, Integer> pow2 = n -> (int) Math.pow(2, n);

    public static int[] process(int[] arr, Function<Integer, Integer> f) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            r[i] = f.apply(arr[i]);
        return r;
    }

    // ------------ Завдання 7 ------------
    public static String[] stringify(int[] arr, Function<Integer, String> f) {
        String[] r = new String[arr.length];
        for (int i = 0; i < arr.length; i++)
            r[i] = f.apply(arr[i]);
        return r;
    }

    public static Function<Integer, String> numToWord = n -> {
        String[] words = {
                "нуль", "один", "два", "три", "чотири",
                "п'ять", "шість", "сім", "вісім", "дев'ять"
        };
        return words[n];
    };
}