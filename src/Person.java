public abstract class Person {
    private String s_Name;

    public Person() {
    }

    public Person(String s_Name) {
        this.s_Name = s_Name;
    }

    public String get_s_Name() {
        return s_Name;
    }

    public void set_s_Name(String s_Name) {
        this.s_Name = s_Name;
    }
}
