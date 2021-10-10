package exercise42.baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ScanEmployeesToListTest {

    @Test
    void scanInFile() throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("data/exercise42_input.txt"));
        ScanEmployeesToList employeeList1 = new ScanEmployeesToList(reader1);

        Map<String, String> employee1 = new LinkedHashMap<>();
        employee1.put("lName", "Ling");
        employee1.put("fName", "Mai");
        employee1.put("salary", "55900");

        Map<String, String> employee2 = new LinkedHashMap<>();
        employee2.put("lName", "Johnson");
        employee2.put("fName", "Jim");
        employee2.put("salary", "56500");

        Map<String, String> employee3 = new LinkedHashMap<>();
        employee3.put("lName", "Jones");
        employee3.put("fName", "Aaron");
        employee3.put("salary", "46000");

        Map<String, String> employee4 = new LinkedHashMap<>();
        employee4.put("lName", "Jones");
        employee4.put("fName", "Chris");
        employee4.put("salary", "34500");

        Map<String, String> employee5 = new LinkedHashMap<>();
        employee5.put("lName", "Swift");
        employee5.put("fName", "Geoffrey");
        employee5.put("salary", "14200");

        Map<String, String> employee6 = new LinkedHashMap<>();
        employee6.put("lName", "Xiong");
        employee6.put("fName", "Fong");
        employee6.put("salary", "65000");

        Map<String, String> employee7 = new LinkedHashMap<>();
        employee7.put("lName", "Zarnecki");
        employee7.put("fName", "Sabrina");
        employee7.put("salary", "51500");

        List<Map<String, String>> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);

        assertTrue(employeeList.size() == employeeList1.scanInFile(reader1).size()
                && employeeList.containsAll(employeeList1.scanInFile(reader1)));

    }
}
