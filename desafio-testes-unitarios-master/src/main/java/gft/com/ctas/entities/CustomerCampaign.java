package gft.com.ctas.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_CAMPAIGN")
@NamedQuery(name="CustomerCampaign.findAll", query="SELECT c FROM CustomerCampaign c")
public class CustomerCampaign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_CAMPAIGN_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_CAMPAIGN_ID_GENERATOR")
	private long id;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "CAMPAIGN_ORIGINATION")
	private CampaignOrigination campaignOrigination;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}