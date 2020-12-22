package gft.com.ctas.dto;

import lombok.Data;

@Data
public class StatusDto {
	
	private Integer reasonCodeId;
	private Integer transactionReason;
	private String shortDesc;
	private String longDesc;

}
