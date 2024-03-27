public class Secretary extends Employee
{
    private int dictationSpeed;

    public Secretary(int id, String name, int dictationSpeed)
    {
        super(id, name);
        this.dictationSpeed = dictationSpeed;
    }

    public void takeDictation(String text)
    {
        System.out.println("Secretary " + name + " is taking dictation at " + dictationSpeed + " wpm: " + text);
    }
}