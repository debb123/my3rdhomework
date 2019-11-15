public class Example{

    public static void main(String args[]){
       /*the constructor is been used here by default person=data,student=object,new person is the constructor by default*/

        // Person student1 = new Person("josh",30);
        Person student2 = new Person("Sandie",30);
        Person student3 = new Person("lois",32);
        Person student4 = new Person("Gabe",25);

        // Animal animal1 = new Animal("Nala", "Cat");
        Animal animal2 = new Animal("Kess", "Bird");
        Animal animal3 = new Animal("Moss", "Dog");
        Animal animal4 = new Animal("Repo", "Snake");

        // we change the student as setName instead of student1.name="josh"  we have 
        // student1.setName("Josh");
        // student1.age=30;

        student2.setName("Sandie");
        student2.age=30;

        /*System.out.println(student1.name);
        System.out.println(student1.age);

        System.out.println(student2.name);
        System.out.println(student2.age);
        replace with the this method*/

        // animal1.attack(student1.getName());
        animal2.attack(student2.getName());
        animal3.attack(student3.getName());
        animal4.attack(student4.getName());
        // student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

        /*student1.printP();
        student2.printP();

        student1.sayHello();
        student2.sayHello();*/

        // for instance josh saying hello to sandie but bc it is a private data student2.name need to be protected.so to acces the data we use the getter which is student2.getName
        // student1.sayHello(student2.getName());

        int sum;
        // Age Sandie+Age Josh combination

        // sum= student1.getAge() + student2.getAge();
        // System.out.println(sum);






    }
}