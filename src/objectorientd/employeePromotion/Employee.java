package objectorientd.employeePromotion;

class Employee implements Promotable {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void promote() {
        if (designation.equalsIgnoreCase("Junior")) {
            designation = "Mid";
            salary += 2000;
        } else if (designation.equalsIgnoreCase("Mid")) {
            designation = "Senior";
            salary += 3000;
        } else if (designation.equalsIgnoreCase("Senior")) {
            designation = "Lead";
            salary += 4000;
        }
    }

    public void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary);
    }
}
