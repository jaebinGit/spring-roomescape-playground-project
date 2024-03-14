package roomescape.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ReadReservationDto {
    private final String name;
    private final String date;
    private final Long timeId;
}
