package notes.model;

import java.util.*;

import notes.utils.DateUtils;
import notes.utils.StringUtils;


public class Note {

    private int id;
    private String title;
    private String content;
    private String createdAt;
    private List<String> tags;

    public Note(int id, String title, String content, String createdAt, List<String> tags) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.tags = new ArrayList<>(tags);
        StringUtils.normalizeTitle(title);
        DateUtils.isValidDateTime(createdAt);
        for (String tag : tags) {
            addTag(tag);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        String t = tag.toLowerCase().trim();
        if (!tags.contains(t)) {
            tags.add(t);
        }
    }

    public boolean removeTag(String tag) {
        return tags.remove(tag);
    }

    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", title='" + title + '\'' +", createdAt='" + createdAt + '\'' +", tags=" + tags +'}';
    }
}
