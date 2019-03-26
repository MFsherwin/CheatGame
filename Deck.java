/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * 
 */
public class Deck {
   
    
    private ArrayList<Card> dc = new ArrayList<Card>();
    
    public Deck(){
        
        
        for (int i =0;i<4;i++){
            for (int j=0;j<13;j++){
            Card e = new Card(i,j);
            dc.add(e);
            }
        }
    }
    //takes one card object and pops it off the top of the list 
    public Card pop(){
        
        Card top = dc.get(dc.size()-1);
        dc.remove(dc.size()-1);
        return top; 
    } 
    
    public void push(Card c){
        dc.add(c);
    
    }
    public void shuffle(){
        Collections.shuffle(dc); 
        
        
        
    }
    //returns iterable with all elements in the list as they currently sit 
    public Iterator getiter(){
        return dc.iterator();
    }

    
}