package jk.pp.ms.medpolicy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.medpolicy.dao.PolicyTypeCrudDAO;
import jk.pp.ms.medpolicy.domain.PolicyType;
import jk.pp.ms.medpolicy.domain.PolicyTypeCrudDTO;

@Service
public class PolicyTypeCrudServiceImpl extends AppCrudServiceImpl<PolicyType, PolicyTypeCrudDTO>
		implements PolicyTypeCrudService {

	public static final String BEAN_ID = PolicyTypeCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public PolicyTypeCrudServiceImpl(PolicyTypeCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}

}
