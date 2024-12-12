package pkg;

public class Movie{
    String movieName;
    double rating;
    int ratings;
    int revenue;
    double addRating;
    
    public Movie(){
        movieName = "unknown";
        rating = 0;
        ratings = 0;
        revenue = 0;
    }
    
    public Movie(String movieName, double rating, int ratings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.ratings = ratings;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + ratings);
        System.out.println("Revenue: " + revenue);
        System.out.println("---------------------");
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double newRating){
        double ratingTotal;
        double ratingAverage;
        ratingTotal = (rating*ratings)+newRating;
        ratings = ratings+1;
        ratingAverage = ratingTotal/ratings;
        rating = ratingAverage;
    }
public double movieRating(){
    return rating;
}
    public boolean compareRatings(Movie a){
        if(this.rating>rating){
            return false;
        }
        else{
            return true;
        }
    }
   }

