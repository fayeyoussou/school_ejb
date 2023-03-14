package com.school.dao.inscription;


import javax.ejb.Local;

import com.school.dao.ITemplate;
import com.school.entities.Inscription;

@Local
public interface IInscriptionLocal extends ITemplate<Inscription, Long> {
	
}
