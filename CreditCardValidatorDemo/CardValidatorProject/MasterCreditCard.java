*Description: This program will holds Master Credit Card 
*Class: Fall - COSC 1437.81002
*Final Project
*Date: 12/10/2019
*@author  Taylor Vu 
*@version 1.0.0
*/ 
public class MasterCreditCard extends CreditCard {
   public MasterCreditCard(String cardNumber) {
       super.number=cardNumber;
   }

   @Override
   public String toString() {
       return "Master Credit Card ["+super.number+"]";
   }

}

