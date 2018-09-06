/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Risma
 */
public class Try {
     public static void main(String [] args){
      try {
        int a = 1 / 0; 
        System.out.println("perintah selanjutnya");  
      }
      catch (Exception kesalahan){
          System.err.println(kesalahan);
      }
   } 
}
