package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("Test 1 : Find department by Id: ");
		Department department = departmentDao.findById(7);
		System.out.println(department);
		
		/*
		System.out.println("Test 2 : Insert method: ");
		Department dp = new Department(null, "Toys3");
		departmentDao.insert(dp);
		System.out.println("Inserted! New id = "+dp.getId());
		*/
		List<Department>list = departmentDao.findAll();
		for(Department db : list) {
			System.out.println(db);
		}
		/*
		System.out.println("Test 3 : Update method: ");
		department = departmentDao.findById(9);
		department.setName("Kitchen");
		departmentDao.update(department);
		*/
		System.out.println("Test 4 : Delete method: ");
		departmentDao.deleteById(10);
	}

}
