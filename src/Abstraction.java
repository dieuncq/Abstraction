public class Abstraction {
    Person person_Information = new Employee();
    Employee employee_Information = new Employee();
}

class Abstraction_Exercise {
    public static void Exercise() {
        Abstraction abstraction_Item = new Abstraction();
        abstraction_Item.employee_Information.set_s_Name("Nguyen Van A");
        abstraction_Item.person_Information.set_s_Name("Le Thi B");
        System.out.println("\nName of employee_Information is: " + abstraction_Item.employee_Information.get_s_Name());
        System.out.println("Name of person_Information is: " + abstraction_Item.person_Information.get_s_Name());

        System.out.println("\nName foreach of classes after changed");
        System.out.println("Name of employee_Information is: " + abstraction_Item.employee_Information.get_s_Name());
        System.out.println("Name of person_Information is: " + abstraction_Item.person_Information.get_s_Name());
    }
}
