package notes.utils;

public class TagValidator {
    public static boolean isValidTag(String tag){
        return tag.length() >= 2 && tag.length() <= 20 && tag.matches("[a-z0-9\\-]");
    }  
}
