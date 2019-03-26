/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * 
 */
public class gamePileController {
    private ArrayList<Card> pile = new ArrayList<Card>();
    private ArrayList<Card> playerOneHand = new ArrayList();
    private ArrayList<Card> playerTwoHand = new ArrayList();
    private ArrayList<Card> playerThreeHand = new ArrayList();
    private ArrayList<Card> playerFourHand = new ArrayList();
    private ArrayList<Card> AIplayerOneHand = new ArrayList();
    private Deck deck = new Deck();
    
    //method to deal out cards to players
    public gamePileController(int numberOfPlayers){
        deck.shuffle();
        if (numberOfPlayers ==4){
           deck.shuffle();
           for (int i =0; i< 13; i++){
               playerOneHand.add(deck.pop());
               playerTwoHand.add(deck.pop());
               playerThreeHand.add(deck.pop());
               playerFourHand.add(deck.pop());
           }
           
                            
        }
        else if (numberOfPlayers == 3){
            for (int j =0;j<17;j++ ){
                playerOneHand.add(deck.pop());
                playerTwoHand.add(deck.pop());
                playerThreeHand.add(deck.pop());
            }
             playerThreeHand.add(deck.pop());
        }
        else if (numberOfPlayers ==2){
            for (int i =0; i<26;i++){
                playerOneHand.add(deck.pop());
                playerTwoHand.add(deck.pop()); 
            }
        }
        else if (numberOfPlayers ==1){
            for (int i =0; i<26;i++){
                playerOneHand.add(deck.pop());
                AIplayerOneHand.add(deck.pop()); 
            
            }
        }
    
    
    }
    //takes card form players hand and puts it on the pile n=1 is player one etc
    public boolean addCard(int n, int suit, int value){
        Card dc = new Card(suit, value);
        switch (n) {
            case 1:
                if (playerOneHand.contains(dc)){
                    int index = playerOneHand.indexOf(dc);
                    pile.add(playerOneHand.remove(index));
                    return true;
                }
                else{
                    return false;
                }
            case 2:
                if (playerTwoHand.contains(dc)){
                    int index = playerTwoHand.indexOf(dc);
                    pile.add(playerTwoHand.remove(index));
                    return true;
                }
                else {
                    return false;
                }
            case 3:
                if (playerThreeHand.contains(dc)){
                    int index = playerThreeHand.indexOf(dc);
                    pile.add(playerThreeHand.remove(index));
                    return true;
                }
                else {
                    return false;
                }
            case 4:
                if (playerFourHand.contains(dc)){
                    int index = playerFourHand.indexOf(dc);
                    pile.add(playerFourHand.remove(index));
                    return true;
                }
                else {
                    return false;
                }
            default:
                break; 
        }
    return false;
    }
    //get n number of cards off top of pile 
    public ArrayList<Card> getPileCards(int n){
        int size = pile.size();
        ArrayList<Card> temp = new ArrayList();
    for (int i =(size-n);i<size;i++ ){
            boolean add = temp.add(pile.get(i));
    
    }
    return temp;
    }
   /* public ArrayList<Card> AIplayerOneAddToPile(){
        boolean val = new Random().nextInt(5)==0;
        if (val){
            
        }
        
    }
    */
    
    public ArrayList<Card> getPlayerOneHand(){
        return playerOneHand;
    }
    public ArrayList<Card> getPlayerTwoHand(){
        return playerTwoHand;
    }
    public ArrayList<Card> getPlayerTheeHand(){
        return playerThreeHand;
    }
    public ArrayList<Card> getPlayerFourHand(){
        return playerFourHand;
    }
    public ArrayList<Card> getAIPlayerOneHand(){
        return AIplayerOneHand;
    }
}
    
