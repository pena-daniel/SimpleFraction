package com.tp1;

public class Fraction {
    private Integer nominateur;
    private Integer denominateur;

    public Fraction(Integer nominateur, Integer denominateur) {
        this.nominateur = nominateur;
        if (denominateur == 0){
            this.denominateur = 1;
        }
        this.denominateur = denominateur;
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
    public String toString() {
        return "Je suis une fraction de nominateur "+nominateur+" et de denominateur "+denominateur;
    }


}
