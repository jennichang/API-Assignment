/**
 * Created by jenniferchang on 8/22/16.
 */
public class Match {

    private String name;
    private int age;
    private String gender;
    private String race;
    private String location;
    private int rating;

    public Match(String name, int age, String gender, String race, String location, int rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.location = location;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String race) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
