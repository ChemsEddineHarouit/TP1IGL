/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

/**
 *
 * @author Chemsou Harouit
 */
public class VectorHelper {
    static final private int TAILLETAB=50;
    
    /**
     * Rôle: Trie un tableau d'entiers
     * @param tableau 
     */
    
    static public void trier(int tableau[])
    {
        int taille=tableau.length;
        boolean changed=true;
        while(changed==true)
        {
            changed=false;
            for (int i = 0; i < taille; i++) 
            {
                if (tableau[i]>tableau[i+1])
                {
                    int temp=tableau[i];
                    tableau[i]=tableau[i+1];
                    tableau[i+1]=temp;
                    changed=true;
                }
            }
        }
        
               
    }
}
