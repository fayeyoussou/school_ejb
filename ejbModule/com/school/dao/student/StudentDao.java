package com.school.dao.student;


import javax.ejb.Stateless;

import com.school.dao.DaoEntite;
import com.school.entities.Student;

@Stateless
public class StudentDao extends DaoEntite<Student, Long> implements IStudentLocal,IStudentRemote{
	@Override
	protected Class<Student> getTypeClass() {
		return Student.class;
	}
}
