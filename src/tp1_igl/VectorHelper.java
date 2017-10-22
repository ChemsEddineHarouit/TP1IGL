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
    
     /**
     * Rôle: sommer tableau1 et tableau2 dans tableau3 (entiers)
     * @param tableau1
     * @param tableau2
     * @return un tableau contenant la somme de tableau1 et tableau2
     * @throws VectorException 
     */
    static public int[] sommer(int tableau1[],int tableau2[]) throws VectorException
    {
        int tableau3[] = new int[TAILLETAB];
        
        if (tableau1.length==tableau2.length)
        {
            int taille = tableau1.length;
            for (int i = 0; i < taille; i++) 
            {
                tableau3[i]=tableau1[i]+tableau2[i];
            }
        }
        else
        {
            throw new VectorException();
        }
        
        return tableau3;
    }
    
    /**
     * Rôle: renvoit le min et le max du tableau d'entiers
     * @param tableau
     * @return un tableau de dimension 2 contenant (min,max)
     */
    static public int[] maxAndMin(int tableau[])
    {
        int res[] = new int[2];
        res[0] = res[1] = tableau[0];
        for(int i = 1; i < tableau.length; i++)
        {
            if(tableau[i] >= res[0]) res[0] = tableau[i];
            if(tableau[i] < res[1]) res[1] = tableau[i];
        }
        return res;
    }
}
