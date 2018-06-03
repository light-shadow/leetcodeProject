package com.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  No.690
 * 员工重要性
 *
 */
public class EmployeeImportance {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = list;

        List<Integer> list2 = new ArrayList<Integer>();
        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;
        employee2.subordinates = list2;


        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;
        employee3.subordinates = list2;

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(getImportance(employees, 1));

    }

    private static int getImportance(List<Employee> employees, int id) {
        // 首先查找list中的每一个员工，找到与给定id相同的员工
        // 拿出此员工的权重值，然后遍历这个员工的下属员工依次拿出权重值相加

        int importnace = 0;
        int length = employees.size();
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        for (int i = 0; i < length; i++) {
            map.put(employees.get(i).id, employees.get(i));
        }

        if (map.get(id).subordinates.size() == 0) {
            return map.get(id).importance;
        } else {
            importnace += map.get(id).importance;
        }
        for (Integer each : map.get(id).subordinates) {
            importnace += getImportance(employees, each);
        }
        return importnace;
    }
}

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;

    public Employee() {
    }

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
};
