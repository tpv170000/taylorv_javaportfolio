
/**
 * Write a description of class DiscoverCreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiscoverCreditCard extends CreditCard {

   public DiscoverCreditCard(String cardNumber) {
       super.number=cardNumber;
   }

   @Override
   public String toString() {
       return "Discover Credit Card ["+super.number+"]";
   }

}

