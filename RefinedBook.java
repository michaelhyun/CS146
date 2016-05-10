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
public class RefinedBook{
	private int index;
	private int ref;

	RefinedBook(){
		index = 0;
		ref = 0;
	}

	public void setIndex(int index){
		this.index = index;
	}

	public void setRef(int ref){
		this.ref = ref;
	}

	public int getIndex(){
		return index;
	}

	public int getRef(){
		return ref;
	}
}