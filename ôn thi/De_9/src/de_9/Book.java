/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_9;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class Book implements Serializable{
    private String id;
    private String authors;
    private String title;
    private String catelogy;

    public Book() {
    }

    public Book(String id, String authors, String title, String catelogy) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.catelogy = catelogy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatelogy() {
        return catelogy;
    }

    public void setCatelogy(String catelogy) {
        this.catelogy = catelogy;
    }
    
    
}
