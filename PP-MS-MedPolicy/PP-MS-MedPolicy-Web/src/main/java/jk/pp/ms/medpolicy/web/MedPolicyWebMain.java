package jk.pp.ms.medpolicy.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@EntityScan(basePackages = { "jk.pp.ms.medpolicy.domain" })
@EnableJpaRepositories(basePackages = { "jk.pp.ms.medpolicy.dao" })
@Import(value = { MSCommonGlobalConfig.class })
@ComponentScan(basePackages = { "jk.pp.ms.medpolicy.domain", "jk.pp.ms.medpolicy.dao", "jk.pp.ms.medpolicy.service",
		"jk.pp.ms.medpolicy.web", "jk.pp.engg.foundations.common", "jk.pp.ms.commons.configs.config" })
public class MedPolicyWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(MedPolicyWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.MEDPOLICY));

		app.run(args);
	}

}