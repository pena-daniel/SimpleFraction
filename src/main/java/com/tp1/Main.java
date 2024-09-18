package com.tp1;

public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        Fraction f1 = new Fraction(1);
        Fraction f2 = new Fraction(1, 2);

        // Question 1 tester les constructeurs
        assert f.toString().equals("Je suis une fraction de nominateur 0 et de denominateur 1");
        assert f1.toString().equals("Je suis une fraction de nominateur 1 et de denominateur 1");
        assert f2.toString().equals("Je suis une fraction de nominateur 1 et de denominateur 2");
        System.out.println(f);
        System.out.println(f1);
        System.out.println(f2);

    }
}