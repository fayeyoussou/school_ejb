package dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class InscriptionRequest {
	private String details;
	private Long course;
	private Long year;
	private Long student;
}
