
class Student
{
    private String name;
    private int grad;

    public Student()
    {
        name = "";
        grad = 0;
    }

    public Person(String name, int grad)
    {
        this.name = name;
        this.grad = grad;
    }

    public String getName()
    {
        return name;
    }

    public int getgrad()
    {
        return grad;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setgrad(int grad)
    {
        this.grad = grad;
    }

    public String toString()
    {
        return "Name: " + name + ", Graduation Year: " + grad;
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
        return grad == person.grad && (name == null ? person.name == null : name.equals(person.name));
    }

    public String introduce()
    {
        return "Hello, I am " + name + " and I am " + grad + " years old.";
    }

    public void celebrateBirthday()
    {
        grad++;
    }
}
