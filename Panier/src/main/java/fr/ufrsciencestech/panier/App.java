package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Panier pan=new Panier(6);
        pan.ajoute(new Orange(2,"Algerie"));
        pan.ajoute(new Orange(2.2,"Russie"));
        pan.ajoute(new Orange(3,"Mexique"));
       
        System.out.println(pan.toString());
    }
}