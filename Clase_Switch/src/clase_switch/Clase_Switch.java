package clase_switch;

import java.util.Scanner;

public class Clase_Switch {

   
    public static void main(String[] args) {
        Scanner oli= new Scanner(System.in); 
        System.out.println("Ingrese el mes ");
        int mes= oli.nextInt();
        System.out.println("Ingrese el año ");
        int año= oli.nextInt();
        switch(mes){
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tiene 30 dias");
                break;
            case 2:
               int bis= año % 4;
               if(bis==0){
                   System.out.println("Tiene 29 dias");
               }else{
                    System.out.println("Tiene 28 dias");
               }
               break;
            default:
               System.out.println("Año o mes no valido");             
    }
    }   
}
