package roomescape.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CreateReservationResponseDto {
    private final Long reservationId;
    private final String name;
    private final String date;
    private final String time;
}
