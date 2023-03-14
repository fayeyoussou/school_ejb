 package com.school.dao.course;




import javax.ejb.Stateless;


import com.school.dao.DaoEntite;
import com.school.entities.Course;

@Stateless
public class CourseDao extends DaoEntite<Course, Long> implements ICourseLocal,ICourseRemote {
	@Override
	protected Class<Course> getTypeClass() {
		return Course.class;
	}
}