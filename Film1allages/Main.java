public class Main{

    public static void main(String[] args) {
        
        FilmProgram book = new FilmProgram ("Mars");
        
        
        Film tainia1 = new Film("Mars","NickSmith",125,"25/11/2016",true);
        Film tainia2 = new Film("Fiction","John Papadopoulos",150,"13/12/2016",false);
         tainia1.setCandidacy(false);
        tainia2.setCandidacy(true);
        
        
        
        book.storeFilm(tainia1);
        
        
        //
        tainia1.printFilm();
        tainia2.printFilm();
        book.showCandidateFilms();
        book.filmsMeanTime();
        book.findFilm("Fiction");
        
        
    }

}