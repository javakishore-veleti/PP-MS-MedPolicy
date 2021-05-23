package jk.pp.ms.medpolicy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.medpolicy.domain.PolicyType;
import jk.pp.ms.medpolicy.domain.PolicyTypeCrudDTO;
import jk.pp.ms.medpolicy.service.PolicyTypeCrudService;

@RestController
@RequestMapping(path = "/api/services/medpolicy/policytype/crud", produces = "application/json")
public class PolicyTypeCrudController extends AppCrudController<PolicyType, PolicyTypeCrudDTO> {

	@Autowired
	public PolicyTypeCrudController(PolicyTypeCrudService service) {
		super.setCrudService(service);
	}

}
