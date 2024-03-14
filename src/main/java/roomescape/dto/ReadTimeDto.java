package roomescape.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ReadTimeDto {
    private final Long timeId;
    private final String time;
}
