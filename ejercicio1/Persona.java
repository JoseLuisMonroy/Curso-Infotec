public class Persona{
    private String name;
    private int age;
    private double height;
    private float weight;
    private boolean isStudent;

    public Persona(String name, int age, double height, float weight, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isStudent = isStudent;
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
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public boolean isStudent() {
        return isStudent;
    }
    public void setStudent(boolean student) {
        isStudent = student;
    }

}