package jk.pp.ms.medpolicy.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.domain.core.BaseDomainUniqueNameDesc;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "PolicyType")
@Table(name = "policy_type")
public class PolicyType extends BaseDomainUniqueNameDesc {

	private static final long serialVersionUID = 1L;

}