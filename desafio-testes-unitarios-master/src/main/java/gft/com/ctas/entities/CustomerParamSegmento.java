package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cyberbank_core.CUSTOMER_PARAM_SEGMENTO")
public class CustomerParamSegmento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "CUSTOMER_PARAM_SEGMENTO_ID_GENERATOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_PARAM_SEGMENTO_ID_GENERATOR")
	private long id;

	private String description;

	@Column(name = "IS_APPROVED_LIMIT")
	private BigDecimal isApprovedLimit;

	@Column(name = "\"MAX\"")
	private BigDecimal max;

	@Column(name = "\"MIN\"")
	private BigDecimal min;

	@Column(name = "SEGMENT_COD")
	private BigDecimal segmentCod;

	@Column(name = "STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name = "STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name = "STATUS_DATE")
	private Timestamp statusDate;

}