package com.school.dao.year;

import javax.ejb.Remote;

import com.school.dao.ITemplate;
import com.school.entities.Year;
@Remote
public interface IYearRemote extends ITemplate<Year, Long> {

}
