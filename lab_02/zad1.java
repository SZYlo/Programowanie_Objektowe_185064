public class Dog {
    String name;
    String breed;
    int age;



    public Dog(String name, String breed, int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }



    public void bark(){
        System.out.println("Wow Wow");
    }
    public void showInformation(){
        System.out.println(breed + " " + name + " " + age);
    }
}



void main() {
    Dog pies1 = new Dog("Kluska", "Amstaf", 10);
    Dog pies2 = new Dog("Bryś", "Boston_Terier", 2);

    pies1.bark();
    pies1.showInformation();
    System.out.println();
    pies2.bark();
    pies2.showInformation();


}