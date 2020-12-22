package gft.com.ctas.entities;

import java.io.Serializable;
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
@Table(name="BOARD_STRUCTURE")
public class BoardStructure implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BOARD_STRUCTURE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOARD_STRUCTURE_ID_GENERATOR")
	private long id;

	@Column(name="BOARD_SUBLEVEL_ID")
	private String boardSublevelId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STRUCT_ORG_TABLE_CODE")
	private String structOrgTableCode;

	@Column(name="STRUCT_ORG_TABLE_DESC")
	private String structOrgTableDesc;

	@Column(name="STRUCTURE_MANUAL_CODE")
	private String structureManualCode;

	@Column(name="STRUCTURE_MANUAL_DESC")
	private String structureManualDesc;

	@Column(name="SUBLEVEL_DESC")
	private String sublevelDesc;
}