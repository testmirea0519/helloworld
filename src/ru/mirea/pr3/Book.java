package ru.mirea.pr3;

import java.lang.*;
public class Book{
    private String authorname;
    private String description;
    private int pagesnums;
    public Book(String c, String d,int p){
        authorname = c;
        description = d;
        pagesnums=p;
    }
    public void setAuthorName(String authorname) {
        this.authorname = authorname;
    }
    public void setPagesnums(int pagesnums){
        this.pagesnums = pagesnums;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAuthorname(String authorname){
        return authorname;
    }
    public String getDescription(String description) {
        return description;
    }
    public int getPagesnums(int pagesnums){
        return pagesnums;
    }
    public String toString(){
        return this.authorname + ", " + this.description + ", number of pages: " + this.pagesnums;
    }
}
