package DevelhopeJavaProgramming;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    public static void setTotalNumberOfEmployees(int totalNumberOfEmployees) {
        Badge.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    public static int getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public String getBadgeIdCode() {
        return badgeIdCode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setBadgeIdCode(String badgeIdCode) {
        this.badgeIdCode = badgeIdCode;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private  String generateBadgeIdCode(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder code = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            code.append(randomChar);
        }

        return code + employee.getName() + employee.getSurname() + code.reverse();
    }
    public void showBadgeDetails(){
        System.out.println("Employee details:" + employee.getEmployeeDetails());
        System.out.println("Employees Badge Code:" + getBadgeIdCode());
    }
    public Badge (Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
    public static void main(String[] args){
        Employee employee2 = new Employee("Kelvin", "Nzioka", "Mumabi Street 1");
        Employee employee3 = new Employee("Annita", "Kaluku", "New York Street 12");
        Employee employee4 = new Employee("Judy", "Kelima", "Manchester street 20");
        Badge badge = new Badge(employee2);
        Badge badge1 = new Badge(employee3);
        Badge badge2 = new Badge(employee4);
        System.out.println("total number of Employees: " + totalNumberOfEmployees);
        badge.showBadgeDetails();
        System.out.println("*****************");
        badge1.showBadgeDetails();
        System.out.println("*****************");
        badge2.showBadgeDetails();
    }
}
