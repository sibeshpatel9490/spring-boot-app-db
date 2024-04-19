/**
 * 
 */
package com.meportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.meportal.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	@Query("from Department d where d.name=:deptName")
	public Department findDeptByName(@Param("deptName") String deptName);
}
