package quiz4calculator;

public class StringUtils {
    //return character at index string.length()/2 as String.
    public static String getMiddleCharacter(String string){
        int Middle = string.length()/2;
        String output = String.valueOf(string.charAt(Middle));
        return output;
    }
    //return near-identical String with character at index string.length()/2 capitalized.
    public static String capitalizeMiddleCharacter(String string){
        int Middle = string.length()/2;
        String str = String.valueOf(string.charAt(Middle));
        //String output = str.substring(0,1).toUpperCase();
        return str.toUpperCase();
    }
//  return near-identical String with character at index string.length()/2 lowercased.
    public static String lowercaseMiddleCharacter(String string){
        int Middle = string.length()/2;
        String str = String.valueOf(string.charAt(Middle));
        //String output = str.substring(0,1).toLowerCase();
        return str.toLowerCase();
    }
//  return near-identical String with each character's casing inverted: Capital letters become lowercase, lowercase letters become lowercase.
    public static String invertCasing(String string){
        char[] charArray = string.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if (Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }else if (Character.isLowerCase(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }string = new String(charArray);
        return string;
    }
//  return true if string contains two identical characters in adjacent indices.
    public static Boolean hasDuplicateConsecutiveCharacters(String string){
        boolean doolean = false;
//      char[] charArray = string.toCharArray();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == i){
                if(i <= string.length() -2){
                    if(string.charAt(i+1)== i){
                        doolean = true;
                    }else if (i > 0){
                        if (string.charAt(i-1) == i){
                            doolean = true;
                        }else return false;
                    }else return false;
                }
            }
        }
        return doolean;
    }
//  return near-identical String with each occurrence of duplicate-adjacent characters removed.
    public static Boolean removeDuplicateConsecutiveCharacters(String string){

        return true;
    }
//  return true if each Character in string occurs exactly 1 time.
    public static Boolean isIsogram(String string){
        for(int i = 0; i < string.length(); i++){
            for (int x = 0; x < string.length(); x++){
                if ((string.charAt(i) == string.charAt(x)&& x != i)){
                    return false;
                }
            }
        }return true;
    }

    public static void main(String[] args) {

        System.out.println(getMiddleCharacter("biggie"));
        System.out.println(capitalizeMiddleCharacter("biggie"));
        System.out.println(lowercaseMiddleCharacter("biGGie"));
        System.out.println(invertCasing("jAVA sTRING cASE iNVERT eXAMPLE"));
        System.out.println(hasDuplicateConsecutiveCharacters("bib"));
        System.out.println(isIsogram("bigie"));
        System.out.println(isIsogram("bige"));
    }
}
