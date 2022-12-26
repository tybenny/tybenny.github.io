package FilmManagement.model;

public class Serial extends Film{
    private int episodes;
    private String avgDuration;

    public Serial() {
    }

    public Serial(int episodes, String avgDuration) {
        this.episodes = episodes;
        this.avgDuration = avgDuration;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(String avgDuration) {
        this.avgDuration = avgDuration;
    }
}
