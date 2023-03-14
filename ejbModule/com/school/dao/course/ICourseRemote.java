package com.school.dao.course;



import javax.ejb.Remote;

import com.school.dao.ITemplate;
import com.school.entities.Course;

@Remote
public interface ICourseRemote extends ITemplate<Course, Long> {
	
}
