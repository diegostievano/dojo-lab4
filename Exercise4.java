import java.util.ArrayList;
import java.util.List;

/*This problem was asked by Twitter.

Implement an autocomplete system. 
That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.*/
public class Exercise4 {
    static String[] InputQueryStringOne = {"dog", "deer", "deal"};
    static String str;
    private static boolean add;
    public static void main(String[] args) throws Exception {
        //str = System.console().readLine();
        str = "de";
        //System.out.println(str);               
        
        ReturnStrings(InputQueryStringOne, str);        
    }

    public static void ReturnStrings(String[] pArray, String pString){
        
        List<String> NewArray = new ArrayList<>();        
        String str2 = "";

        for (int i = 0; i < pArray.length; i++){
            //str2 = str2 +  pArray[i].getCharFromString(0, pString.length());
            str2 = pArray[i].substring(0, 2);
            System.out.println(str2);
            if (str2.equals(pString)){
                
                NewArray.add(pArray[i]);
            }
            //NewArray.add(pArray[i]);
            //System.out.println(NewArray);
            //SearchString(pArray[i]);
        }
        System.out.println(NewArray);
    } 

    /*public static void SearchString(String pString){
        String str2;        
        //System.out.println(pString.length());
        
        for (int i = 0; i < pString.length(); i++){
            //str2 = str2.substring(i) + str2;
            //str2 = pString.substring(i);
            
            //str2 = getCharFromString(pString, i);
            //System.out.println(str2);
        }
        
    }*/


}
