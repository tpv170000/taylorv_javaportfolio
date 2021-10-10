*Description:Validates Credit Card and displays Credit Card Information
*Class: Fall - COSC 1437.81002
*Final Project
*Date: 08/15/2011
*@author  Taylor Vu
*@version 1.0.0
*/ 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCard{
   public static final int INVALID = -1;
   public static final int VISA = 0;
   public static final int MASTERCARD = 1;
   public static final int AMERICAN_EXPRESS = 2;
   public static final int EN_ROUTE = 4;
   public static final int DINERS_CLUB = 5;
   public static final int DISCOVER = 3;
   public String number;
   private static final String[] cardNames = { "Visa", "Mastercard", "American Express", "Discover" };

   /**
   * Valid a Credit Card number
   */
   public static boolean validCC(String number) throws Exception {
       int CardID;
       if ((CardID = getCardID(number)) != -1)
           return validCCNumber(number);
       return false;
   }

   /**
   * Get the Card type returns the credit card type INVALID = -1; VISA = 0;
   * MASTERCARD = 1; AMERICAN_EXPRESS = 2; DISCOVER = 3
   */
   public static int getCardID(String number) {
       int valid = INVALID;
       String digit1 = number.substring(0, 1);
       String digit2 = number.substring(0, 2);
       String digit3 = number.substring(0, 3);
       String digit4 = number.substring(0, 4);

       if (isNumber(number)) {
           if (digit1.equals("4")) {
               if (number.length() == 13 || number.length() == 16)
                   valid = VISA;
           }
  
           else if (digit2.compareTo("51") >= 0 && digit2.compareTo("55") <= 0) {
               if (number.length() == 16)
                   valid = MASTERCARD;
           }


           else if (digit4.equals("6011")) {
               if (number.length() == 16)
                   valid = DISCOVER;
           }

           else if (digit2.equals("34") || digit2.equals("37")) {
               if (number.length() == 15)
                   valid = AMERICAN_EXPRESS;
           }

       }

       return valid;

   }

   public static boolean isNumber(String n) {
       try {
           double d = Double.valueOf(n).doubleValue();
           return true;
       } catch (NumberFormatException e) {
           e.printStackTrace();
           return false;
       }
   }

   public static String getCardName(int id) {
       return (id > -1 && id < cardNames.length ? cardNames[id] : "");
   }

   public static boolean validCCNumber(String n) {
       try {
           /*
           * * known as the LUHN Formula (mod10)
           */
           int j = n.length();

           String[] s1 = new String[j];
           for (int i = 0; i < n.length(); i++)
               s1[i] = "" + n.charAt(i);

           int checksum = 0;

           for (int i = s1.length - 1; i >= 0; i -= 2) {
               int k = 0;

               if (i > 0) {
                   k = Integer.valueOf(s1[i - 1]).intValue() * 2;
                   if (k > 9) {
                       String s = "" + k;
                       k = Integer.valueOf(s.substring(0, 1)).intValue() + Integer.valueOf(s.substring(1)).intValue();
                   }
                   checksum += Integer.valueOf(s1[i]).intValue() + k;
               } else
                   checksum += Integer.valueOf(s1[0]).intValue();
           }
           return ((checksum % 10) == 0);
       } catch (Exception e) {
           e.printStackTrace();
           return false;
       }
   }

   /**
   * It writes valid/Invalid card numbers to the file bases on the file name
   * given.
   *
   * @param filename
   * @param cardNums
   */
   public static void write(String filename, List<String> cardNums) {
       System.out.println("Writing Numbers to " + filename + "....");
       File file = new File(filename);
       // creates the file
       try {
           file.createNewFile();

           // creates a FileWriter Object
           FileWriter writer = new FileWriter(file);
           // Writes the content to the file
           for (String number : cardNums) {
               writer.append(number + "\n");
           }
           writer.flush();
           writer.close();
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
   }

   /**
   * Read the file with the given space separated numbers in it.
   *
   * @param input
   * filename
   */
   public static void read(String filename) {
       System.out.println("Reading " + filename + "....");

       List<String> validCards = new ArrayList<String>();
       List<String> invalidNums = new ArrayList<String>();
       try {
           BufferedReader read = new BufferedReader(new FileReader(filename));
           String line = null;
           // ArrayList to maintain list of Valid and Invalid Card numbers.

           while ((line = read.readLine()) != null) {
               String[] var = line.split(" ");
               for (String cardNum : var) {

                   System.out.println("Card number : " + line);
                   int cardType = getCardID(line);
                   CreditCard card = null;
                   CardInstance cardInstance = new CardInstance();
                   if ((validCC(line))) {

                       card = cardInstance.getCard(cardType,line);
                       System.out.println("This is a " + getCardName(cardType) + " card. " + card.toString());
                       validCards.add(card.toString());
                   }

                   else
                       System.out.println("This card is invalid or unsupported!");
                   invalidNums.add(line);
               }
           }
      
       } catch (Exception e) {
           e.printStackTrace();
       }
       write("valid_cards.txt", validCards);
       write("invalid_numbers.txt", invalidNums);
       System.out.println("Finished!");
   }

     public static void main(String args[]) throws Exception {
       read("cardNumbers.txt");
     }
}
