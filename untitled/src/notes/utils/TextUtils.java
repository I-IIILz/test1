package notes.utils;

public class TextUtils {
    public static boolean isValidContent(String content){
        return content.length()>=1 && content.length() <= 5000;
    }
    public static String truncateContent(String content, int maxLength){
        if(content.length()<maxLength) return content;
        return content.substring(0, maxLength) + "...";
    }
    public static int countWords(String text) {
        return text.trim().split("\\s+").length;
    }
    public static boolean searchInText(String text, String keyword){
        return text.toLowerCase().contains(keyword);
    }
}
