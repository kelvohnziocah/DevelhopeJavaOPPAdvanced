package DevelhopeJavaProgramming;

public class Employee {
    private String name;
    private String surname;
    private String address;
    public Employee (String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmployeeDetails(){
        return String.format("full name: %s %s%n Home Address: %s%n",getName(), getSurname(), getAddress());
    }
}
