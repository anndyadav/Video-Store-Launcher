/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package videostorelauncher;
import java.util.*;

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

class videostore{
    static void addVideo(String n, ArrayList <video> list){
        String name = n;
        list.add(new video(name,false,0,false));
       /* System.out.println("Enter name: ");
        Scanner n  = new Scanner(System.in);
        name = n.nextLine();
        arr[i] = new video(name,false,0,false);
        System.out.println("Added: "+ arr[i].title);*/
    }
    
    static void checkout(String n, ArrayList <video> list){
        Iterator a = list.iterator();
        int i = 0;
        while(a.hasNext()){
            if()
        }
        
        
        /*if(arr[index].checked == true){
            System.out.println("Video Already Rented.");
        }
        else{
            arr[index].checked = true;
        }*/
    }
    
    static void returnVideo(int index,video [] arr){
        arr[index].return_cd = true;
    }
    
    static void recieveRating(int index, video [] arr, int rating){
        arr[index].average_rating = rating;
        System.out.println("Rating Updated");
    }
    
    static void listInventory(video [] arr){
        System.out.println("Name\t Rating\n");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].title+"\t"+arr[i].average_rating);
        }
        
    }
    
    
}


public class VideoStoreLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <video> list = new ArrayList <video>();
        /*int i = 5;
        video [] arr = new video[20];
        arr[0] = new video("Godzilla",false,4,false);
        arr[1] = new video("Terminator",false,3,false);
        arr[2] = new video("The Shawshank Redemption",false,5,false);
        arr[3] = new video("Wolf of the wall street",false,4,false);
        arr[4] = new video("Fault of the stars",false,4,false);
        
        System.out.println(arr.length);*/
        
        list.add(new video("Godzilla",false,4,false));
        list.add(new video("Terminator",false,3,false));
        list.add(new video("The Shawshank Redemption",false,5,false));
        list.add(new video("Wolf of the wall street",false,4,false));
        list.add(new video("Fault of the stars",false,4,false));
        
        int choice;
        String name = new String();
        
        System.out.println("Enter Choice:");
        System.out.println("1: ADD Video\n2: Checkout\n3: Return Video\n4: List Inventory\n5: Give Rating");
        
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        
        
        switch(choice){
            case 1 : 
                System.out.println("Enter Name: ");
                name = s.nextLine();
                videostore.addVideo(name,list);
                
                break;
            case 2 : 
                System.out.println("Enter Name");
                name = s.nextLine();
                //int index = get_index(name,arr);
                videostore.checkout(name,list);
                break;
            case 3 : 
                System.out.println("Enter Name");
                name = s.nextLine();
                //index = get_index(name,arr);
                videostore.returnVideo(get_index(name,arr),arr);
                break;
            case 4 : 
                videostore.listInventory(arr);
                break;
            case 5 :
                System.out.println("Enter Name");
                name = s.nextLine();
                //index = get_index(name,arr);
                int rating;
                System.out.println("Enter Rating: ");
                rating = s.nextInt();
                videostore.recieveRating(get_index(name,arr),arr,rating);
        }
         
    }
    
    static int get_index(String n, video [] arr){
            int index = 0;
            for(int i=0;i<arr.length;i++){
                if(n==arr[i].title){
                    index = i;
                }
            }
            if(index!=0){
                return index;
            }
            else
                return 0;
        }
    
}
