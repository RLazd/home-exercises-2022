package io.codelex.classesandobjects.practice.Dog;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;

    }

    public String fathersName() {
        if (this.father == null) {
            return "Unknown";
        }
        return this.father;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.mother == null || otherDog.mother == null) {
            return false; //possibly
        }
        return this.mother == otherDog.mother;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}

