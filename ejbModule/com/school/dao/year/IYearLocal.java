package com.school.dao.year;

import javax.ejb.Local;

import com.school.dao.ITemplate;
import com.school.entities.Year;
@Local
public interface IYearLocal extends ITemplate<Year, Long> {

}
