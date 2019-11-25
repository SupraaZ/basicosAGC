/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosagc;

/**
 *
 * @author Adrian
 */
public class BasicosAGC {
    public static void logicos(){
        boolean logico=true;
        int num=4;
        if (num==4){
            System.out.println("Es verdadero");
            logico=true;
        }
        else{
             System.out.println("Es falso");
            logico=false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        logicos();
    }
    
}
