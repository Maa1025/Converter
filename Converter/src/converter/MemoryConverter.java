/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MemoryConverter {
    
    public static void convert(){
        double mb;
        Scanner input = new Scanner(System.in);
        
        //Memory converter
        System.out.print("Insert memory in MB:");
        mb = input.nextDouble();
        double kb = mb*1024; //Conversion factor mb to kb
        System.out.print("Memory in KB:"+kb);
    }
}
