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
public class MassConverter {
    public static void convert(){
        double kg;
        double mass = 2.2; //conversion factor kg to pound
        Scanner input = new Scanner(System.in);
        
        //Mass Converter
        System.out.print("Insert mass in kg: ");
        kg = input.nextDouble();
        double pound = (kg*mass);
        System.out.println("Mass in pound: "+pound);
    }
}
