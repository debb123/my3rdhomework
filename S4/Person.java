public class Person{
   
    // Attribute
    // Assuming that we are working in bank or big sector the name must not be the same so we change public String name to private.
    // assuming we are in a vedio game assigning points  
    private String name;
    public int age;
    public int points;

    // constructor
    // we use exactly the same name and everything is there by default .all the constructor using an empty one.we use the class which is the person it in our example creating this contructor passing two parameters

    public Person( String name, int age){

        this.name=name;
        this.age =age;
        this.points=100;

    }

    // methods
    // we also change the sayHello to a setName that means using setter to access.the setter have a lot of conditions like if(user===admin)you can modifiy the name using the privacy of the data (private)

    public void setName(String name){
            this.name=name;
        

    }
    // we decide to sayhello when josh sayhello to sandie
    // we pass some new strings in the parameter instead of public void sayHello(){}we now have and use the concetonation system.out.println("Hello") to
    
    public String getName(){
        return this.name;
    }

    public void sayHello(String friend){
        System.out.println("Hello" + friend);

    }
    public void printP(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.points);
    }

    public int getAge(){
        return this.age;
    }

}
