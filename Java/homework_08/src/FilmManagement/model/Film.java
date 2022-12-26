package FilmManagement.model;

public class Film {
    private String id;
    private String name;
    private String category;
    private String directorName;
    private String releaseDate;

    public Film() {
    }

    public Film(String id, String name, String category, String directorName, String releaseDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.directorName = directorName;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
