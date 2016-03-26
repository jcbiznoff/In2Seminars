package com.app.in2.javaexp3;

/**
 * Created by jaychung on 3/26/16.
 */
public class Book {
    private String name;
    private String authorName;
    private String publishedDate;
    private int numOfPages;
    private int numOfChapters;
    private String category;
    private boolean isHardCover;
    private boolean isColorCopy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfChapters() {
        return numOfChapters;
    }

    public void setNumOfChapters(int numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
