package roomescape.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Reservation {
        private final Long ReservationId;
        private final String name;
        private final String date;
        private final Time time;
}
