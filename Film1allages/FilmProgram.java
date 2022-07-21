import java.util.ArrayList;
import java.util.*;

public class FilmProgram  {
    private ArrayList<Film> list;
    private String title;
    
    
    public FilmProgram(String title)
    {
        this.title=title;
        list = new ArrayList<>();
    }
    
    
    public void storeFilm(Film lists)
    {
        list.add(lists);
    }
    
    public ArrayList<Film> getList()
      {
        return list;
      
      }
      
    public void showFilms()
    {
       
        for(Film lists : list)
        {
            System.out.println(lists.getTitle());
        }
        
    }
    
    public void showCandidateFilms()
    {
      System.out.println("***** QUESTION d: show the list of films that are candidate for OSCAR *****");
      for(Film lists : list)
      {
          
          if (lists.Candidacy()==false) 
      
          System.out.println(lists.getTitle());
      
      }
    }
    
    public double filmsMeanTime(){
    double playingTime = 0;
    {
        for(Film lists : list)
       playingTime= playingTime  + lists.getPlayingTime();
        System.out.println("***** QUESTION e: mean time of all films *****");
        System.out.println("The mean playing time of all the films in the collection is " +  playingTime);
        
    }
    double x =  playingTime/list.size();
    return playingTime;
    } 
    public void findFilm(String title){
       System.out.println("***** QUESTION f: search for films *****");
         boolean found = false;
          for (Film lists : list) 
        
    {
         if (title.equals(lists.getTitle()))
     {
        lists.printFilm();
        found = false;
        break;
      
     }
     if (found = true) 
     {
          
         System.out.println("The film Holiday does not belong to the collection");
         System.out.println( title + ", " + "Director " + lists.getDirector());
         System.out.println(lists.getPlayingTime() +  " minutes ");
         System.out.println(lists.ShowDate());
     }
    }
}
    }