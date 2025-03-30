
class Person
{
    private String name;
    private int age;

    public Person()
    {
        name = "";
        age = 0;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if (other == null || getClass() != other.getClass())
        {
            return false;
        }
        Person person = (Person) other;
        return age == person.age && (name == null ? person.name == null : name.equals(person.name));
    }

    public String introduce()
    {
        return "Hello, I am " + name + " and I am " + age + " years old.";
    }

    public void celebrateBirthday()
    {
        age++;
    }
}
