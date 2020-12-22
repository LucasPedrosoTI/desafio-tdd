package gft.com.ctas.dto;

import lombok.Data;

@Data
public class AccountReq {

	private long id;
	private String bank;
	private long bankActivityCode;
	private long branch;
	private long businessSector;
	private long centralBankActicityCode;
	private long channel;
	private long currency;
	private long insuranceCode;
	private long isoProductType;
	private String name;
	private String nickName;
	private String operationId;
	private long product;
	private String shortName;
	private long status;
	private long stampUser;
	private long statusReason;
	private long subProduct;

}
