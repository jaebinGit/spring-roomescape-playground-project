package roomescape.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateTimeRequestDto {
    @NotBlank(message = "Time is required")
    private final String time;

    @JsonCreator
    public CreateTimeRequestDto(@JsonProperty("time") String time) {
        this.time = time;
    }
}
