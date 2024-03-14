package roomescape.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CreateTimeResponseDto {
    private final Long timeId;
    private final String time;
}
