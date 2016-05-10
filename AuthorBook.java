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
public class AuthorBook {
    private int ref;
   // private int firstLetter;
    private String lastName;
    private String title;
    
    AuthorBook(){
        ref = 0;
        //firstLetter = 0;
        lastName = "";
        title = "";
    }
    
    public int getRef(){
        return ref;
    }
    
   // public int getfLetter(){
      //  return firstLetter;
  //  }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setRef(int ref){
        this.ref = ref;
    }
    
   // public void setfLetter(int fLetter){
       // firstLetter = fLetter;
   // }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
}
