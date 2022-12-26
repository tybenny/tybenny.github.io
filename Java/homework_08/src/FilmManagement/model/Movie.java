package FilmManagement.model;

public class Movie extends Film{
    private String duration;

    public Movie() {
    }

    public Movie(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
