public class Technician extends Employee
{
    private String expertise;

    public Technician(int id, String name, String expertise)
    {
        super(id, name);
        this.expertise = expertise;
    }

    public void fixMachine(String machineType)
    {
        System.out.println("Technician " + name + " with expertise in " + expertise + " is fixing a " + machineType + " machine.");
    }
}