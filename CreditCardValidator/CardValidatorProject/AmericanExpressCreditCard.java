*Description: Holds American Express Credit Card
*Class: Fall - COSC 1437.81002
*Assignment1: Hello World
*Date: 12/10/2019
*@author  Taylor Vu
*@version 1.0.0
*/ 
public class AmericanExpressCreditCard extends CreditCard {

   public AmericanExpressCreditCard(String cardNumber) {
       super.number=cardNumber;
   }

   @Override
   public String toString() {
       return "American Express Credit Card ["+super.number+"]";
   }

}

