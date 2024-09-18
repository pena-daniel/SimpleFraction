package com.tp1;

public class Fraction {
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

    public Integer getNominateur() {
        return nominateur;
    }

    public Integer getDenominateur() {
        return denominateur;
    }


    public Float doubleValue(){
        return (float) (nominateur/denominateur);
    }




    @Override
    public String toString() {
        return "Je suis une fraction de nominateur "+nominateur+" et de denominateur "+denominateur;
    }




}
