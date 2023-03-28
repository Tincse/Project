package com.jdbc.studentmgt.dao;

import com.jdbc.studentmgt.entity.Address;
import com.jdbc.studentmgt.entity.Student;

public interface StudentDAO
{
public Student getStudent(int id);
public void deleteStudent(int id);
public void updateStudent(int id,String name,String contact,Address add);
public void insertStudent(String name,String contact,Address add);
 
}
