package jk.pp.ms.medpolicy.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.core.domain.medpolicy.IPolicyInfo;
import jk.pp.engg.foundations.common.domain.core.BaseDomainUniqueNameDesc;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "PolicyInfo")
@Table(name = "policy_info")
public class PolicyInfo extends BaseDomainUniqueNameDesc implements IPolicyInfo {

	private static final long serialVersionUID = 1L;

}
