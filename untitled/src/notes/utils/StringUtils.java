package notes.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static String trimAndNormalize(String text){
        return text.trim().replaceAll("\\s+", " ");
    }
    public static String normalizeTitle(String title){
        String normalizetitle = trimAndNormalize(title);
        if (normalizetitle.length() <3){
             throw new IllegalArgumentException("Title too short");
        }
        return normalizetitle.substring(0,1).toUpperCase() + normalizetitle.substring(1);
    }
    public static boolean isValidTitle(String title){
        String validtitle = normalizeTitle(title);
        return validtitle.length() <= 100 && validtitle.matches("[A-Za-zА-Яа-я0-9 .\\-]+");
    }
    public static List<String> parseTags(String tagsString){
        List<String> result = new ArrayList<>();
        String[] parts = tagsString.split(",");
        for (String p : parts) {
            String tag = p.trim().toLowerCase();
            if (!tag.isEmpty()) {
                result.add(tag);
            }
        }
        return result;
    }
        
    public static String joinTags(List<String> tags){
        return String.join(",",tags);
    }
}
