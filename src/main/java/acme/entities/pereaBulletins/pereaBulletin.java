
package acme.entities.pereaBulletins;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class pereaBulletin extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	//@Pattern(regexp = "^[a-zA-Z]{1,}(Bulletin)$")
	private String				title;

	@NotBlank
	@Column(length = 1024)
	private String				body;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

}
