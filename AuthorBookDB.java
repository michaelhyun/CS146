/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class AuthorBookDB {
    AuthorBook[] db;
    List<Book>list;
    String authorN;
    
    AuthorBookDB(List<Book> list, String authorName){
        db = new AuthorBook[list.size()];
        this.list = list;
        authorN = authorName.toLowerCase();
            if(authorName.contains(" ")){
                for(int i = 0; i < list.size(); i++){
                    if(list.get(i).getAuthor().contains(authorName)){
                db[i] = new AuthorBook();
                db[i].setRef(i);
                db[i].setTitle((list.get(i).getTitle().toLowerCase()));
                    }
             }
            }else{
            for(int i = 0; i < list.size(); i++){
                db[i] = new AuthorBook();
                db[i].setRef(i);
                db[i].setLastName((list.get(i).getAuthor().toLowerCase().substring(authorName.length())));         
            }
       }
    }
    
    public void shellSort(){
        int inner, outer;
        AuthorBook temp;
        
        if(authorN.contains(" ")){
            shellSortTitle();
        }
        else{
        int h = 1;
        while (h <= db.length / 3) {
            h = h * 3 + 1;
        }
        
        while (h > 0) {
            for (outer = h; outer < db.length; outer++) {
                temp = db[outer];
                inner = outer;
 
             while (inner > h - 1 && (db[inner - h].getLastName().compareTo(temp.getLastName()) > 0)){
                db[inner] = db[inner - h];
                inner -= h;
             }
                 db[inner] = temp;
            }
             h = (h - 1) / 3;
            }
        }
    }
    
     private void shellSortTitle(){
        int inner, outer;
        AuthorBook temp = new AuthorBook();
 
        int h = 1;
        while (h <= db.length / 3) {
            h = h * 3 + 1;
        }
        
        while (h > 0) {
            for (outer = h; outer < db.length; outer++) {
                temp = db[outer];
                inner = outer;
 
             while (inner > h - 1 && (db[inner - h].getTitle().compareTo(temp.getTitle()) > 0)){
                db[inner] = db[inner - h];
                inner -= h;
             }
                 db[inner] = temp;
            }
             h = (h - 1) / 3;
            }
        }
    
    public void printList(){
        for(int i = 0; i < db.length; i++){
            db[i].getTitle();         
        }
        System.out.println();
    }
    
    public void printRef(){
        for(AuthorBook b: db){
            System.out.println(b.getRef());
        }
        
        System.out.println();
    }
    
    public List<Book> returnList(){
        List<Book> newList = new ArrayList();
    	for(AuthorBook book: db){
    		newList.add(list.get(book.getRef()));
    	}
    	return newList;
    }
}
