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
public class VectorException extends Exception {
    /**
     * 
     * @return 
     */
    static public String message()
    {
        String s;
        s="Tableaux de taille differente";
        return s;
    }
}
