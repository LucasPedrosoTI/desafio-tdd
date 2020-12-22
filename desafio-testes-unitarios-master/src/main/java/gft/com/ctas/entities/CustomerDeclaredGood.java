package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_DECLARED_GOODS")
public class CustomerDeclaredGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_DECLARED_GOODS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_DECLARED_GOODS_ID_GENERATOR")
	private long id;

	@Column(name="ARTWORKS_QUANTITY")
	private BigDecimal artworksQuantity;

	@Column(name="ARTWORKS_VALUE")
	private BigDecimal artworksValue;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Column(name="INDUSTRIAL_PROPERTIES_QUANT")
	private BigDecimal industrialPropertiesQuant;

	@Column(name="INDUSTRIAL_PROPERTIES_VALUE")
	private BigDecimal industrialPropertiesValue;

	@Column(name="INVESTMENTS_VALUE")
	private BigDecimal investmentsValue;

	@Column(name="RURAL_PROPERTIES_QUANTITY")
	private BigDecimal ruralPropertiesQuantity;

	@Column(name="RURAL_PROPERTIES_VALUE")
	private BigDecimal ruralPropertiesValue;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@Column(name="URBAN_PROPERTIES_QUANTITY")
	private BigDecimal urbanPropertiesQuantity;

	@Column(name="URBAN_PROPERTIES_VALUE")
	private BigDecimal urbanPropertiesValue;

	@Column(name="VEHICLES_QUANTITY")
	private BigDecimal vehiclesQuantity;

	@Column(name="VEHICLES_VALUE")
	private BigDecimal vehiclesValue;

}