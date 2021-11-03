class Animal {
    char gender;

    public Animal(char gender) {
        this.gender = gender;
    }

    public void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    String Name;

    public Dog(char gender, String name) {
        super(gender);
        Name = name;
    }

    public void bark() {
        System.out.println("barking...");
    }
}

class GermanShepard extends Dog {
    private String dogID;

    public GermanShepard(char gender, String Name, String dogID) {
        super(gender, Name);
        this.dogID = dogID;
    }

    public String getDogID() {
        return dogID;
    }

    public void setDogID(String dogID) {
        this.dogID = dogID;
    }

    public void weep() {
        System.out.println("weeping...");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        GermanShepard dog = new GermanShepard('M',"Sheero","123");
        System.out.println(dog.getDogID());
        dog.weep();
        dog.bark();
        dog.eat();
    }
}
