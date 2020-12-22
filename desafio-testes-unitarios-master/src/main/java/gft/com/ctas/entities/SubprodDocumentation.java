package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SUBPROD_DOCUMENTATION")
@NamedQuery(name="SubprodDocumentation.findAll", query="SELECT s FROM SubprodDocumentation s")
public class SubprodDocumentation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUBPROD_DOCUMENTATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUBPROD_DOCUMENTATION_ID_GENERATOR")
	private long id;

	@Column(name="DEFAULT_VALUE")
	private String defaultValue;

	@Column(name="DESCRIPTION_VALUE")
	private String descriptionValue;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="SUBPROD_DOC_TYPE")
	private BigDecimal subprodDocType;

	@Column(name="SUBPROD_DOCUMENTATION")
	private String subprodDocumentationColumn;

	@Column(name="SUBPROD_DOCUMENTATION_ID")
	private BigDecimal subprodDocumentationId;

}