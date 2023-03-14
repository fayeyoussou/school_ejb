package com.school.dao.year;

import javax.ejb.Stateless;

import com.school.dao.DaoEntite;
import com.school.entities.Year;
@Stateless
public class YearDao extends DaoEntite<Year, Long> implements IYearLocal, IYearRemote {

	

	@Override
	protected Class<Year> getTypeClass() {
		
		return Year.class;
	}

	

}
