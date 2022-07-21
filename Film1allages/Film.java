
public class Film  
{
    private String  title;
    private String director;
    private int playingTime;
    private boolean candidacy;
    private String showDate;
    
    
    
  public Film(String title , String director , int playingTime ,String showDate , boolean candidacy)
  {
      this.title=title;
      this.director=director;
      this.playingTime=playingTime;
      this.showDate=showDate;
      this.candidacy=false;
  }    
  public Film(String title)
  {
      this.title=title;
  }
  public void setTitle(String title)
  {
       this.title = title;
  }
  public void setDirector(String director)
  {
      this.director = director;
  }
  public void setCandidacy(boolean candidacy)
  {
      this.candidacy = candidacy;
  }
  public void setShowDate(String showDate)
  {
      this.showDate = showDate;
  }
 
  public String getTitle()
  {
    return title;     
  
  }
  public String getDirector()
  {
      return director;
  }
  public int getPlayingTime()
  {
      return playingTime;
  }
  public boolean Candidacy()
  {
      return candidacy;
  }
  public String ShowDate()
  {
      return showDate;
  }
  public void  printFilm() 
  {
       
      if (candidacy==false) 
      {
           System.out.println("***** QUESTION c: show the list of all the films *****");
      System.out.println(title + "," + "Director " + director);
      System.out.println( playingTime + "minutes");
      System.out.println(showDate);
          System.out.println("Candidate for Oscar!");
          
      }
      else  if (candidacy==true)
      
      {
        System.out.println(title + "," + "Director " + director);
        System.out.println( playingTime + "minutes");
        System.out.println(showDate);  
        //System.out.println("no Candidate for Oscar!");
      }
  }
  
  
}