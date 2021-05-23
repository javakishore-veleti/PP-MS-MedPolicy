package jk.pp.ms.medpolicy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.medpolicy.dao.PolicyInfoCrudDAO;
import jk.pp.ms.medpolicy.domain.PolicyInfo;
import jk.pp.ms.medpolicy.domain.PolicyInfoCrudDTO;

@Service
public class PolicyInfoCrudServiceImpl extends AppCrudServiceImpl<PolicyInfo, PolicyInfoCrudDTO>
		implements PolicyInfoCrudService {

	public static final String BEAN_ID = PolicyInfoCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public PolicyInfoCrudServiceImpl(PolicyInfoCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
