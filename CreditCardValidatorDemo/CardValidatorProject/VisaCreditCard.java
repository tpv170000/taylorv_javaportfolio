*Description: This program will hold Visa Credit cards
*Class: Fall - COSC 1437.81002
*Final Project
*Date: 08/15/2011
*@author  Taylor Vu 
*@version 1.0.0
*/ 
public class VisaCreditCard extends CreditCard {

   public VisaCreditCard(String cardNumber) {
       super.number=cardNumber;
   }

   @Override
   public String toString() {
       return "Visa Credit Card ["+super.number+"]";
   }

}

