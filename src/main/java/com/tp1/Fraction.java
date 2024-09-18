package com.tp1;

public class Fraction extends  Number{
    private Integer nominateur;
    private Integer denominateur;

    public Fraction(Integer nominateur, Integer denominateur) {
        this.nominateur = nominateur;
        if (denominateur == 0){
            this.denominateur = 1;
        }else{
            this.denominateur = denominateur;
        }
    }

    public Fraction(Integer nominateur) {
        this.nominateur = nominateur;
        this.denominateur = 1;
    }

    public Fraction() {
        this.nominateur = 0;
        this.denominateur = 1;
    }

    @Override
    public int intValue() {
        return nominateur/denominateur;
    }

    @Override
    public long longValue() {
        return nominateur/denominateur;
    }

    @Override
    public float floatValue() {
        return (float) nominateur /denominateur;
    }

    public Integer getNominateur() {
        return nominateur;
    }

    public Integer getDenominateur() {
        return denominateur;
    }


    @Override
    public double doubleValue(){
        return (float) (nominateur/denominateur);
    }

    public Fraction add(Fraction f){
        Integer n = (nominateur * f.denominateur)+(denominateur*f.nominateur);
        Integer d = f.denominateur * denominateur;
        return new Fraction(n,d);
    }

    public Fraction reduite(){
        Integer pgcd = findGCD(denominateur, nominateur);

        return new Fraction(nominateur/pgcd, denominateur/pgcd);
    }

    public int compare(Fraction f1) {
        int result = f1.nominateur * denominateur - nominateur * f1.denominateur;
        if (result > 0) {
            return 1; // f1 is greater
        } else if (result < 0) {
            return -1; // f1 is less
        } else {
            return 0; // is equal
        }
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }




    @Override
    public String toString() {
        return "Je suis une fraction de nominateur "+nominateur+" et de denominateur "+denominateur;
    }




}
