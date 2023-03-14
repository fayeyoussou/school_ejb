package com.school.dao.student;


import javax.ejb.Remote;

import com.school.dao.ITemplate;
import com.school.entities.Student;

@Remote
public interface IStudentRemote extends ITemplate<Student, Long> {
	
}
