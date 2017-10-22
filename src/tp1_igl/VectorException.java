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
     * Exception message
     * @return a string describing the error Message
     */
    static public String message()
    {
        String s;
        int[] tab;
        s="Error 0x1 : Tableaux de taille differente";
        return s;
    }
}
