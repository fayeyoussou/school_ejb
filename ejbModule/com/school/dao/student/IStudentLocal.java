package com.school.dao.student;

import javax.ejb.Local;

import com.school.dao.ITemplate;
import com.school.entities.Student;

@Local
public interface IStudentLocal extends ITemplate<Student, Long> {
	
}
