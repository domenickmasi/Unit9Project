class Employee extends Person
{
    private double salary;

    public Employee()
    {
        super();
        salary = 0.0;
    }

    public Employee(String name, int age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String introduce()
    {
        return super.introduce() + " I work as an employee with a salary of $" + salary + ".";
    }

    public String toString()
    {
        return super.toString() + ", Salary: " + salary;
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
        Employee employee = (Employee) other;
        return super.equals(employee) && salary == employee.salary;
    }

    public String work()
    {
        return getName() + " is working on tasks.";
    }

    public String takeVacation()
    {
        return getName() + " is on vacation.";
    }
}
