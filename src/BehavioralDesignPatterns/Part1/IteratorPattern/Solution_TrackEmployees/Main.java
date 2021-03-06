package BehavioralDesignPatterns.Part1.IteratorPattern.Solution_TrackEmployees;

public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList(zak, sarah, anna);
    StaffListIterator iterator = staffList.iterator();

    while(iterator.hasNext()) {
      Employee employee = iterator.next();
      System.out.println(employee.getName());
    }
  }

}
