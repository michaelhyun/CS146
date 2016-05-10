/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author David
 */
public class ISBNBook {
    private int ref;
    private int isbn;
    
    ISBNBook(){
        ref = 0;
        isbn = 0;
    }
    
    public int getRef(){
        return ref;
    }
    
    public int getISBN(){
        return isbn;
    }
    
    public void setRef(int ref){
        this.ref = ref;
    }
    
    public void setISBN(int isbn){
        this.isbn = isbn;
    }
}
