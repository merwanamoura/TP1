/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author ma522501
 */
public class Orange {
    
    double prix;
    String origine;

    public Orange(double prix, String origine) {
        
        if( prix >=0 )
        {
            this.prix = prix;
            this.origine = origine;   
        }
        else 
        {
             System.out.println("Prix négatif impossible");
        }
        
    }

    public double getPrix() {
        return prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Orange d'origine "+this.origine+" et ayant pour prix : "+this.prix+" euros \n";
    }
    
    public boolean equals(Orange orange){
        if(this.prix == orange.prix && this.origine.equals(orange.origine)) return true;
        else return false;
    }
    
    
}
