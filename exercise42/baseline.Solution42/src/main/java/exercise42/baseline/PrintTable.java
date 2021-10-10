package exercise42.baseline;

import java.util.List;
import java.util.Map;

public class PrintTable {
    List<Map<String, String>> employeeList;

    //constructor
    PrintTable (List<Map<String, String>> employeeList){
        this.employeeList = employeeList;
    }

    public void printTheTable (List<Map<String, String>> employeeList){
        //if List is not empty print the table
        //print header
        //print table
        //for each map in the list, print the map values
        //else
        //print "No information found."


        if (!employeeList.isEmpty()){
            //print table header
            System.out.printf("Last      First     Salary%n" +
                    "--------------------------%n");

            //for each map in the list, print the map values
            for (Map<String, String> map : employeeList){
                String last = map.get("lName");
                String first = map.get("fName");
                String salary = map.get("salary");
                System.out.format("%-10s%-10s%s%n", last, first, salary);
            }
            //else print no matching results.
        } else{
            System.out.println("\nNo information found.");
        }
    }
}
