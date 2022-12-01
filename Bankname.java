/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankname;

/**
 *
 * @author DELL
 */
public class Bankname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  bank icici=new bank();
   icici.bank_name="ICICI Bank";
   icici.interest=7;
    icici.display_interest();
  bank iob=new bank();
   iob.bank_name="IOB Bank";
   iob.interest=9;
    iob.display_interest();
    bank sbi=new bank();
   sbi.bank_name="SBI Bank";
   sbi.interest=8;
    sbi.display_interest();}
    
    
    
    
    }  
    
   
}
