package lesson9.Domain;

public class User {

    private String name;

    private Integer summ;

    public User(String name, Integer summ) {
        this.name = name;
        this.summ = summ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSumm() {
        return summ;
    }

    public void setSumm(Integer summ) {
        this.summ = summ;
    }
}
