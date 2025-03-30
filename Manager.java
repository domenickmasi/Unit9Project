class Manager extends Employee
{
    private int teamSize;

    public Manager()
    {
        super();
        teamSize = 0;
    }

    public Manager(String name, int age, double salary, int teamSize)
    {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize()
    {
        return teamSize;
    }

    public void setTeamSize(int teamSize)
    {
        this.teamSize = teamSize;
    }

    public String work()
    {
        return getName() + " is managing a team of " + teamSize + ".";
    }

    public String toString()
    {
        return super.toString() + ", Team Size: " + teamSize;
    }

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
        Manager manager = (Manager) other;
        return super.equals(manager) && teamSize == manager.teamSize;
    }

    public String hireEmployee()
    {
        return getName() + " hired a new employee.";
    }

    public String fireEmployee()
    {
        return getName() + " fired an employee.";
    }
}