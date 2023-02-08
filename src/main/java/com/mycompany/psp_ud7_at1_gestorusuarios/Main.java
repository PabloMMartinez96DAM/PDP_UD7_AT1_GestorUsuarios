/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.psp_ud7_at1_gestorusuarios;

import enums.Commands;
import java.util.Scanner;
import managers.UIManager;

/**
 *
 * @author dam
 */
public class Main {

    
    
    private static Commands command = Commands.NONE;
    
    public static void main(String[] args) {
        
        while (command != Commands.SALIR) {
            
                // Esperamos aquí hasta que el usuario haya introducido un comando válido
                command = Commands.values()[UIManager.getInput()];
                
                switch(command){
                    
                    case REGISTRO:
                        break;
                        
                        
                    case LOGIN:
                        break;
                        
                        
                    case SALIR:
                        break;
                        
                    default:
                        System.out.println("Ha ocurrido un error inesperado");
                        
                        break;
                        
                        
                    
                    
                }
                
                
            }
        
    }
    
    
   

   
    
}
