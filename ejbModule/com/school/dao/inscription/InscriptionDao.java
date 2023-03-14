package com.school.dao.inscription;


import javax.ejb.Stateless;

import com.school.dao.DaoEntite;
import com.school.entities.Inscription;
@Stateless
public class InscriptionDao extends DaoEntite<Inscription, Long> implements IInscriptionLocal, IInscriptionRemote {

	@Override
	protected Class<Inscription> getTypeClass() {
		return Inscription.class;
	}

}
