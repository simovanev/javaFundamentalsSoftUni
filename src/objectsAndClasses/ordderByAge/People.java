package objectsAndClasses.ordderByAge;

public class People {
    private String name;
    private String id;
    private int age;

    public People(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",this.name,this.id,this.age);
    }
}
