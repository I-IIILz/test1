package notes;
import notes.model.Note;
import notes.model.Notebook;
import notes.utils.DateUtils;
import notes.utils.StringUtils;
import notes.utils.TagValidator;
import notes.utils.TextUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Шаг 2: Работа со строками ===\n");

        String rawTitle = "  my java   note  ";
        System.out.println("Raw: \"" + rawTitle + "\"");
        String normalized = StringUtils.normalizeTitle(rawTitle);
        System.out.println("Normalized: \"" + normalized + "\"");
        System.out.println("Valid: " + StringUtils.isValidTitle(normalized));

        System.out.println("\nTag Processing:");
        String rawTags = "java, OOP, PRACTICE"; 
        System.out.println("Raw tags: " + rawTags);
        var parsed = StringUtils.parseTags(rawTags);
        System.out.println("Parsed: " + parsed);
        System.out.println("Joined: " + StringUtils.joinTags(parsed));

        System.out.println("\nTag Validation:");
        System.out.println("java: " + TagValidator.isValidTag("java"));
        System.out.println("j: " + TagValidator.isValidTag("j"));
        System.out.println("Java@123: " + TagValidator.isValidTag("java@123"));

        String content = "This is a long note about Java programming and OOP concepts";
        System.out.println("\nContent Preview:");
        System.out.println(TextUtils.truncateContent(content, 20));
        System.out.println("Word count: " + TextUtils.countWords(content));
        System.out.println("Search 'Java': " + TextUtils.searchInText(content, "Java"));
        System.out.println("Search 'Python': " + TextUtils.searchInText(content, "Python"));

        System.out.println("\nDate validation:");
        System.out.println("2025-01-15 10:30: " +
                DateUtils.isValidDateTime("2025-01-15 10:30"));

        Note note = new Note(
                1,
                rawTitle,
                content,
                "2025-01-15 10:30",
                Arrays.asList("JAVA", "oop")
        );

        System.out.println("\nCreated note:");
        System.out.println(note);
    }
}
