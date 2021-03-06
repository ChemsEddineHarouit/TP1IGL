/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

import java.util.function.Function;

/**
 *
 * @author Chemsou Harouit
 */
public class VectorHelper {
    static final private int TAILLETAB=50;
    
    /**
     * Rôle: Trie un tableau d'entiers
     * @param tableau 
     * @return tableau apres tri
     */
    
    static public int[] trier(int tableau[])
    {
        int taille=tableau.length;
        boolean changed=true;
        while(changed==true)
        {
            changed=false;
            for (int i = 0; i < taille-1; i++) 
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
        
        return tableau;
               
    }
    
    /**
     * Rôle: inverse les éléments du tableau d'entiers
     * @param tableau 
     * @return nouveau tableau apres modification
     */
    static public int[] inverser(int tableau[])
    {
        int taille=tableau.length;
        int borneSup=taille-1,borneInf=0;
        while(borneSup>borneInf)
        {
            int temp=tableau[borneSup];
            tableau[borneSup]=tableau[borneInf];
            tableau[borneInf]=temp;
            
            borneSup--;borneInf++;
        }
        
        return tableau;
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
        int tableau3[] = new int[tableau1.length];
        
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
     * Rôle: applique la fonction donnée en paramètre à tous les éléments du tableau d'entiers
     * @param tableau
     * @param fonction 
     * @return tableau apres application de la fonction
     */
    public static int[] appliquer(int tableau[], Function<Integer, Integer> fonction)
    {
        int taille=tableau.length;
        for(int i = 0; i < taille; i++)
        {
            tableau[i] = fonction.apply(tableau[i]);
        }
        return tableau;
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
        int taille=tableau.length;
        for(int i = 1; i < taille; i++)
        {
            if(tableau[i] >= res[0]) res[0] = tableau[i];
            if(tableau[i] < res[1]) res[1] = tableau[i];
        }
        return res;
    }
}
