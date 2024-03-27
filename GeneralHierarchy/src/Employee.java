public class Employee
{
    private int id;
    public String name;
    private Manager manager;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setManager(Manager manager)
    {
        this.manager = manager;
    }

    public Manager getManager()
    {
        return manager;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Employee [id=%d, name=%s, manager=%s]", id, name, manager);
    }
}