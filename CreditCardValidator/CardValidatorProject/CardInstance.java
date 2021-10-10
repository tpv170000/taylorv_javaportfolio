*Description: This program will Instance method for types of Credit Cards
*Class: Fall - COSC 1437.8100
*Final Project 
*Date: 12/10/2019
*@author  Taylor Vu 
*@version 1.0.0
*/ 
public class CardInstance {

   public CreditCard getCard(int cardType, String aCard) {
       CreditCard card = null;
       switch (cardType) {
       case 0:
           card = new VisaCreditCard(aCard);
           break;
       case 1:
           card = new MasterCreditCard(aCard);
           break;
       case 2:
           card = new AmericanExpressCreditCard(aCard);
           break;
       case 3:
           card = new DiscoverCreditCard(aCard);
           break;
       }
       return card;
   }
}

