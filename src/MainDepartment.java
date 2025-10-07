import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainDepartment {
    public static void main(String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: Department Insert ===");
        Department newDepartment = new Department(null, "Retail");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());


        System.out.println("\n=== TEST 4: Department Update ===");
        department = departmentDao.findById(6);
        department.setName("Home");
        departmentDao.update(department);
        System.out.println("Update! Completed ");

        System.out.println("\n=== TEST 5: seller Delete ===");
        System.out.print("Enter id for delete test: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed");

        sc.close();



    }

}