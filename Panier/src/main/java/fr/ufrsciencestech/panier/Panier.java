/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author ma522501
 */
public class Panier {
    
    ArrayList<Orange> tabOrange;
    int nbOrangeMax;
    int nbOrange;

    public Panier(int nbOrangeMax) {
        tabOrange= new ArrayList<Orange>();
        this.nbOrangeMax = nbOrangeMax;
        nbOrange=0;
    }
    
    public boolean estPlein(){
        if(nbOrange == nbOrangeMax) return true;
        else return false;
    }
    
    public boolean estVide(){
        if(nbOrange == 0) return true;
        else return false;
    
    }

    @Override
    public String toString() {
       String s="";
       for(int i=0;i<nbOrange;i++)
       {
           s+=tabOrange.get(i).toString();
       }
       return s;
    }
    
    public boolean equals (Panier panier){
        boolean bol=true;
        
        for(int i = 0; i< this.nbOrange;i++){
            if( !this.tabOrange.get(i).equals(panier.tabOrange.get(i)))
            {
                bol=false;
            }
        }
        
        return bol;
        
    }
    
    public void ajoute(Orange or)
    {
        if(!estPlein())
        {
            tabOrange.add(or);
            nbOrange++;
        }
        
    }
    public void retire()
    {
        if(!estVide())
        {
            tabOrange.remove(nbOrange-1);
            nbOrange--;
        }
    }
    
    public double getPrix()
    {
        double price=0;
        for(int i = 0; i< this.nbOrange;i++){
            price+=tabOrange.get(i).getPrix();
        }
        return price;
    }
    
    public void boycotteOrigine(String origine){
        for(int i = 0; i< this.nbOrange;i++){
            if(this.tabOrange.get(i).origine.equals(origine)){
                tabOrange.remove(i);
                nbOrange--;
            }
        }
    }
}
