

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author Anand Yadav
 */


class video{
    String title;
    boolean checked;
    int average_rating;
    boolean return_cd;
    
    
    video(String tit, boolean che, int avgrating, boolean returncd){
        title = tit;
        checked = che;
        average_rating = avgrating;
        return_cd = returncd;   
    }
      
}

class videostore extends video{
    
    

    static void addVideo(String n, ArrayList <video> list){
        //System.out.println(11);
        list.add(new video(n,false,0,false)); 
    }
    
    static void checkout(String n, ArrayList <video> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i).title == n){
                if(list.get(i).checked == true){
                    System.out.println("Video Already Rented");
                }
            }
            else {
                list.get(i).checked = true;
            }
                
            }

    }
    
    static void returnVideo(String n,ArrayList <video> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i).title == n){
                list.get(i).return_cd = true;
                System.out.println("Video Returned.");
                }
            }
              
            }
    
    
    static void recieveRating(String n, ArrayList <video> list, int rating){
        for(int i=0;i<list.size();i++){
            if(list.get(i).title == n){
                list.get(i).average_rating = rating;
                    System.out.println("Video Rating Updated.");
                }
            }   
    }
    
    
    static void listInventory(ArrayList <video> list){
	System.out.println("\n");
        System.out.println("Name\t Rating\n");
        for(int i=0;i<list.size();i++){
            if(list.get(i).checked==false)
            System.out.println(list.get(i).title+"\t"+list.get(i).average_rating);
        }
        
        
    }

    public videostore(String tit, boolean che, int avgrating, boolean returncd) {
        super(tit, che, avgrating, returncd);
    }
    
    
}


public class VideoStoreLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <video> list = new ArrayList <video>();
        //default objects
        list.add(new video("Godzilla",false,4,false));
        list.add(new video("Terminator",false,3,false));
        list.add(new video("The Shawshank Redemption",false,5,false));
        list.add(new video("Wolf of the wall street",false,4,false));
        list.add(new video("Fault of the stars",false,4,false));
        
        int choice;
        System.out.println("Enter Choice:");
        System.out.println("1: ADD Video\n2: Checkout\n3: Return Video\n4: List Inventory\n5: Give Rating");
        
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        
	String name = new String();
        
        switch(choice){
            case 1 : 
                System.out.println("Enter Name: ");
                name = s.nextLine();
                videostore.addVideo(name,list);
                break;
            case 2 : 
                System.out.println("Enter Name: ");
                name = s.nextLine();
                videostore.checkout(name,list);
                break;
            case 3 : 
                System.out.println("Enter Name: ");
                name = s.nextLine();
                videostore.returnVideo(name,list);
                break;
            case 4 : 
                videostore.listInventory(list);
                break;
            case 5 :
                System.out.println("Enter Name: ");
                name = s.nextLine();
                int rating;
                System.out.println("Enter Rating: ");
                rating = s.nextInt();
                videostore.recieveRating(name,list,rating);
        }
      
    } 
}
