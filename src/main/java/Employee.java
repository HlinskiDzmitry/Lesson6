public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Имя: "+fullName+", "+"должность: "+position+", "+"электронная почта: "+email+", "+"мобильный номер: "+phone+", "+"заработная плата: "+salary+", "+"возраст: "+age+".");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("1", "1", "1", "1", 1, 1);
        employee.info();
    }
}
