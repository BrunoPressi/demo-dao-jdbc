package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	public void insert(Department department);

	public void update(Department departmen);

	public void deleteById(Integer id);

	public Department findById(Integer id);

	public List<Department> findAll();
}
