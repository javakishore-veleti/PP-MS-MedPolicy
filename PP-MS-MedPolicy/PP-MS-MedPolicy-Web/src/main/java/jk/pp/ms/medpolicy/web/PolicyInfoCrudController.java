package jk.pp.ms.medpolicy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.medpolicy.domain.PolicyInfo;
import jk.pp.ms.medpolicy.domain.PolicyInfoCrudDTO;
import jk.pp.ms.medpolicy.service.PolicyInfoCrudService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "/api/services/medpolicy/policyinfo/crud", produces = "application/json")
public class PolicyInfoCrudController extends AppCrudController<PolicyInfo, PolicyInfoCrudDTO> {

	@Autowired
	public PolicyInfoCrudController(PolicyInfoCrudService service) {
		super.setCrudService(service);
	}

}
