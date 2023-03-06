package com.ll;

public class WiseSaying {
    private long id;
    private String contents;
    private String authorName;

    public WiseSaying(long id, String contents, String authorName) {
        this.id = id;
        this.contents = contents;
        this.authorName = authorName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
