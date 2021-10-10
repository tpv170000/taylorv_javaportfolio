/**
*Description: This program will hold the methods and parameters for Morse Code Converter 
*Class: Fall - COSC 1437.81002
*Assignment 9: Morse Code Converter 
*Date: 11/12/2019
*@author  Taylor
*@version 0.0.0
*/ 
/**
* @param input String as args
* @return morse as string, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/
public class Morse
{
int Num_Chars = 40;
private String original;
private String mcode;
private char[] regular;
private char[][] morse;

public Morse(String input){
    original = input;
    mcode = "";
    regular = new char[Num_Chars];
    morse= new char[Num_Chars][Num_Chars];
    for (int k= 0; k <original.length(); k++){
    regular[k] = original.charAt(k);
}
for (int g =0; g<morse.length; g++){
  for (int c= 0; c<toMorse(regular[g]).length();c++){
      morse[g][c] = toMorse(regular[g]).charAt(c);
  }
  mcode = mcode + toMorse(regular[g]);
}
}
public String toMorse(char ch){
    String k;
    ch = Character.toUpperCase(ch);
    switch (ch) {
        case ' ':
        k = " ";
        return k;
        
        case ',':
        k = "--..--";
        return k;
        
        case '.':
        k= ".-.-.-";
        return k;
        
        case '?':
        k = "..--..";
        return k;
        
        case'0':
        k="-----";
        return k;
        
        case'1':
        k= ".----";
        return k;
        
        case'2':
        k="..---";
        return k;
        
        case'3':
        k= "...--";
        return k;
        
        case'4':
        k="....-";
        return k;
        
        case'5':
        k =".....";
        return k;
        
        case'6':
        k= "-....";
        return k;
        
        case'7':
        k="--...";
        return k;
        
        case'8':
        k="---..";
        return k;
        
        case'9':
        k="----.";
        return k;
        
        case 'A':
        k=".- ";
        return k;
        
        case 'B':
        k="-… ";
        return k;
        
        case 'C':
        k="-.-. ";
        return k;
        
        case 'D':
        k="-.. ";
        return k;
        
        case 'E':
        k=". ";
        return k;
        
        case 'F':
        k="..-. ";
        return k;
                    
        case 'G':
        k="--. ";
        return k;
        
        case 'H':
        k="…. ";
        return k;
        
        case 'I':
        k=".. ";
        return k;
                    
        case 'J':
        k=".--- ";
        return k;
        
        case 'K':
        k="-.- ";
        return k;
        
        case 'L':
        k=".-.. ";
        return k;
                    
        case 'M':
        k="-- ";
        return k;
        
        case 'N':
        k="-. ";
        return k;
        
        case 'O':
        k="--- ";
        return k;
        
        case 'P':
        k=".--. ";
        return k;
        
        case 'Q':
        k="--.- ";
        return k;  
                    
        case 'R':
        k=".-. ";
        return k;  
                    
        case 'S':
        k="... ";
        return k;
        
        case 'T':
        k="- ";
        return k;  
        
        case 'U':
        k="..- ";
        return k; 
        
        case 'V':
        k="...- ";
        return k;
        
        case 'W':
        k=".-- ";
        return k;
        
        case 'X':
        k="-..- ";
        return k;
        
        case 'Y':
        k="-.-- ";
        return k;
        
        case 'Z':
        k="--.. ";
        return k;
    }
    return "";
}
public String getMorseCode(){
    return mcode;
}
public String getOriginal(){
    return original; 
}
}
