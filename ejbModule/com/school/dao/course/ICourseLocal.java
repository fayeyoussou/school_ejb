package com.school.dao.course;



import javax.ejb.Local;

import com.school.dao.ITemplate;
import com.school.entities.Course;

@Local
public interface ICourseLocal extends ITemplate<Course, Long> {
}
