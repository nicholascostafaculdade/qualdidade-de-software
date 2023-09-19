package basicCRUD.models;

public class User {
    private String name;
    private String ra;
    private String course;
    private String shift;
    private char sex;

    public User(String name, String ra, String course, String shift, char sex) {
        super();
        this.name = name;
        this.ra = ra;
        this.course = course;
        this.shift = shift;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", ra=" + ra + ", course=" + course + ", shift=" + shift + ", sex=" + sex + "]";
    }

}
