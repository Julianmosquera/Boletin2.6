
package bol26;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol26 {

    
     
    public static void main(String[] args) {
        float precio,pagado,total;
        System.out.println("precio original:");
        Scanner obx=new Scanner (System.in);
        precio=obx.nextFloat();
        System.out.println("Introduce el precio pagado");
        pagado=obx.nextFloat();
        total=((precio-pagado)/precio)*100;
        System.out.println("Descuento="+total+"%");
        
        
    }
    
}
