package com.school.dao.inscription;


import javax.ejb.Remote;

import com.school.dao.ITemplate;
import com.school.entities.Inscription;

@Remote
public interface IInscriptionRemote extends ITemplate<Inscription, Long>{
	
}
