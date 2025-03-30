import java.util.ArrayList;

public class InheritanceTester
{
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<Person>();

        Person p1 = new Person();
        Employee p2 = new Employee();
        Manager p3 = new Manager();
        Manager p4 = new Manager("Evan", 45, 90000.0, 3);
        Employee p5 = new Employee("Alice", 30, 60000.0);
        Manager p6 = new Manager("Bob", 40, 80000.0, 5);
        Manager p7 = new Manager("Bob", 40, 80000.0, 5);
        Person p8 = new Person("Charlie", 20);
        Employee p9 = new Employee("Diana", 28, 50000.0);
        Employee p10 = new Employee("Diana", 28, 50000.0);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

        for (int i = 0; i < people.size(); i++)
        {
            Person person = people.get(i);
            System.out.println(person.toString());
            System.out.println(person.introduce());

            if (person instanceof Manager m) 
            {
                System.out.println(m.work());
                System.out.println(m.hireEmployee());
                System.out.println(m.fireEmployee());
            }
            else if (person instanceof Employee e)
            {
                System.out.println(e.work());
                System.out.println(e.takeVacation());
            }
            //idk what instanceof does but vscode told me to use it and it fixed my errors soooo

            System.out.println();
        }
    }
}
