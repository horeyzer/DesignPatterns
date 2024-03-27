public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Jonathan Joestar");
        Employee emp2 = new Employee(2, "Josuke Higashikata");

        Secretary secretary = new Secretary(3, "Jotaro Kujo", 80);
        Technician technician = new Technician(4, "Joseph Joestar", "Networking");
        Manager manager = new Manager(5, "Dio Brando", "Engineering");

        emp1.setManager(manager);
        secretary.setManager(manager);
        technician.setManager(manager);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(secretary);
        System.out.println(technician);
        System.out.println(manager);

        secretary.takeDictation("This is a test dictation.");
        technician.fixMachine("printer");
    }
}