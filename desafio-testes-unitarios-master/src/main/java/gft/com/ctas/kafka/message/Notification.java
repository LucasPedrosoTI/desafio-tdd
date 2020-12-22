package gft.com.ctas.kafka.message;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Notification {
	
	private String documentation;
	private Integer parameterId;
	private String parameterValue;

}
