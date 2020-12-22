package gft.com.ctas.kafka.message;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
@Component
public class CtasMessage {

	private Integer id;
	private String message;
	private String phoneNumber;
	private String customerId;
	private String identificationNumber;
	private Long personType;
	private String email;
	private String eventId;
	private Notification notification;
	private List<Notification> notifications;
	private String productId;
	private String mnemonic;
	private String systemId;

	@SerializedName("table")
	private String table;

	@SerializedName("op_type")
	private String opType;

	@SerializedName("op_ts")
	private Date opTs;

	@SerializedName("current_ts")
	private Date currentTs;

	@SerializedName("pos")
	private String pos;

	@SerializedName("after")
	private After after;

}