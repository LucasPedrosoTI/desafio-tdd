package gft.com.ctas.kafka.message;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class KafkaHeaders {
	
	private String key;
	private String value;
	private Integer partition;
	private Long offset;

}
