package notes;
import notes.model.Note;
import notes.model.Notebook;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Шаг 1: Базовая модель заметок ===\n");

        Notebook nb1 = new Notebook(1, "Java Learning",
                "Notes about Java programming");
        Notebook nb2 = new Notebook(2, "Web Development",
                "HTML, CSS, JavaScript notes");

        System.out.println("Notebooks:");
        System.out.println(nb1);
        System.out.println(nb2);

        System.out.println("\nNotes:");

        Note note1 = new Note(
                1,
                "OOP Principles",
                "OOP concepts in Java",
                "2025-01-15 10:30",
                Arrays.asList("java", "oop", "theory")
        );

        Note note2 = new Note(
                2,
                "Collections Framework",
                "Lists, Sets, Maps",
                "2025-01-16 14:20",
                Arrays.asList("java", "collections", "list")
        );

        System.out.println(note1);
        System.out.println(note2);

        System.out.println("\nTag Operations:");

        System.out.println("Original tags: " + note1.getTags());
        note1.addTag("practice");
        System.out.println("After adding 'practice': " + note1.getTags());

        note1.removeTag("theory");
        System.out.println("After removing 'theory': " + note1.getTags());

        System.out.println("Has tag oop: " + note1.hasTag("oop"));
        System.out.println("Has tag 'database': " + note1.hasTag("database"));
    }
}
