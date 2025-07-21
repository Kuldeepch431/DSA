import java.sql.SQLOutput;

public class Dog {
    String name;
    String breed;
    int age;

    Dog()
    {
        System.out.println("Dog class constructor called");
    }
    Dog(String name,String breed,int age)
    {
        this.name=name;
        this.breed=breed;
        this.age=age;
    }

    String getName()
    {
        return name;
    }

    String getBreed(){
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tuffy","German shefard",2);
        Dog dog2 = dog1;
        dog1.name="tiger";
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

        labra l = new labra();

        System.out.println(dog1.toString());
    }
}

 class labra extends Dog{
    labra(){
        super();
    }
}
