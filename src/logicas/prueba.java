package logicas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/PropertyEditor.java to edit this template
 */

import java.beans.*;
import java.util.Arrays;

/**
 *
 * @author cesar
 */
public class prueba extends PropertyEditorSupport {
    
    /**
     *
     * @param args
     */
    public static void main(String args[])
    {  
        String STR = "j,a,v,a"; 
        char[] StringtoChar = STR.toCharArray();
        Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);
        System.out.println("The Unsorted String is : " + STR); 
        System.out.println("The Sorted String is : " + SortedString);  
    }  
}
