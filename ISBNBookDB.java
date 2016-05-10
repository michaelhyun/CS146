/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.List;


/**
 *
 * @author David
 */
public class ISBNBookDB {
    ISBNBook[] tempArray;
    ISBNBook[] db;
    List<Book> list;
    int targetISBN;
    
    ISBNBookDB(List<Book> list, int targetISBN){
        this.list = list;
        this.targetISBN = targetISBN;
        tempArray = new ISBNBook[list.size()];
        db = new ISBNBook[list.size()];
        for(int i = 0; i < list.size();i++){
            db[i] = new ISBNBook();
            db[i].setISBN(list.get(i).getISBN());
            db[i].setRef(i);
        }
        
        
    }
    
    public void mergeSort(int low, int high){
        if(low < high){
            int middle = low + (high - low) / 2;
            
            mergeSort(low,middle);
            mergeSort(middle+1,high);
            mergeParts(low,middle,high);
            
        }
    }
   
    private void mergeParts(int low, int middle, int high){
        
        for(int i = low; i <= high; i++){
            tempArray[i] = db[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        
        while(i <= middle && j <= high){
            if(tempArray[i].getISBN() <= tempArray[j].getISBN()){
                db[k] = tempArray[i];
                i++;
            }else{
                db[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            db[k] = tempArray[i];
            k++;
            i++;
        }
    }
    
    public void printList(){
        for(ISBNBook b: db){
            System.out.println(b.getISBN());
        }
    }
    
    public void printRef(){
        for(ISBNBook b: db){
            System.out.println(b.getRef());
        }
    }
    
    public int binarySearch(int left,int right){
        if(left > right){
            return -1;
        }
        int middle = (left + right) / 2;
        
        if(db[middle].getISBN() == targetISBN ){
            return db[middle].getRef();
        }
        else if(db[middle].getISBN() > targetISBN){
            return binarySearch(left,middle-1);
        }
        else{
            return binarySearch(middle+1,right);
        }
    }
        
    
}
