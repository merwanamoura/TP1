package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        Panier pan=new Panier(9);
        pan.ajoute(new Orange(2,"Algerie"));
        pan.ajoute(new Orange(2.2,"Russie"));
        pan.ajoute(new Orange(3,"Mexique"));
        pan.ajoute(new Orange(1.8,"Allemagne"));
        pan.ajoute(new Orange(1.7,"France"));
        pan.ajoute(new Orange(2.3,"Mexique"));
        pan.ajoute(new Orange(3,"Mexique"));
       
        System.out.println(pan.toString());
        
        VueConsole VC = new VueConsole(pan);
        VC.setVisible(true);
    }
}
