/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentaccountant;

import javax.swing.JOptionPane;

/**
 *
 * @author msh32
 */
public class InstallmentAccountant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String  Salary, CarPrice, CarModel;
        Salary=JOptionPane.showInputDialog("Salary  "+"أدخل الراتب ");
        CarPrice=JOptionPane.showInputDialog("Car Price  "+"أدخل سعر السيارة");
        CarModel=JOptionPane.showInputDialog("Car Model  "+"ادخل موديل السيارة");
        
        double S,CP,M  ,  IA,NoM ;                                               // IA=installment amount, NoM=No. of months.
        S=Double.parseDouble(Salary);                                            // convert string salary to Double.
        CP=Double.parseDouble(CarPrice);                                         // convert string car_Price to Double.
        M=Double.parseDouble(CarModel);                                          // convert string Car_Model to Double.
        
        if (S>3000 && CP>=60000 && M>2008)                                       // Dealer Requirements متطلبات يحددها التاجر
        {
        IA=S/3;
        NoM=CP/IA;
      
        JOptionPane.showMessageDialog(null,"Car price = "+"سعر السيارة = "+CP+
                                     "\ninstallment amount = "+"  مقدار القسط = "+IA+
                                     "\nNo. of months = "+" عدد الأشهر = "+NoM);
        
        
       // JOptionPane.showMessageDialog(null,"سعر السيارة = "+CP+"\n  مقدار القسط ="+IA+"\n عدد الأشهر = "+NoM);         // for Arabic
       // JOptionPane.showMessageDialog(null,"Car price = "+CP+"\nInstallment amount = "+IA+"\nNo. of months = "+NoM);  // for English 
        }
        else 
        JOptionPane.showMessageDialog(null, "التقسيط غير مسموح لهذه الحالات"+
                                     "\nError !!\ninstallment not allowed in this cases"); // Dealer Requirements متطلبات يحددها التاجر
        
        
    }
    
}
