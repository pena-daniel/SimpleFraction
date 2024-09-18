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

        // Question 4
        assert f.getDenominateur() == 1;
        assert f.getNominateur() == 0;

        assert f1.getDenominateur() == 1;
        assert f1.getNominateur() == 1;


        // Question 5
        assert f.doubleValue() == 0;
        assert f1.doubleValue() == 1;
        assert f2.doubleValue() == 0.5;

        // Question 5
        Fraction f3 = new Fraction(1,1);
        Fraction f4 = new Fraction(3,2);

        assert f.add(f1).doubleValue().equals(f3.doubleValue());
        assert f1.add(f2).doubleValue().equals(f4.doubleValue());

        // Question 7
        Fraction f5 = new Fraction(4,6);
        Fraction f6 = new Fraction(8,12);

        assert f5.reduite().equals(f6.reduite());

        System.out.println(f);
        System.out.println(f1);
        System.out.println(f2);

    }
}