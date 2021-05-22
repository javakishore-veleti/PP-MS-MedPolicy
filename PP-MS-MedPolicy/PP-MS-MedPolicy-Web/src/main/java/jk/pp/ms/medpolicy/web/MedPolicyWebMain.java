package jk.pp.ms.medpolicy.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@Import(MSCommonGlobalConfig.class)
public class MedPolicyWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(MedPolicyWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.MEDPOLICY));

		app.run(args);
	}

}