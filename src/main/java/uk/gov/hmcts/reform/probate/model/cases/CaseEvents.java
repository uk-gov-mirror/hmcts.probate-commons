package uk.gov.hmcts.reform.probate.model.cases;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaseEvents {

    private final EventId createDraftEventId;

    private final EventId updateDraftEventId;

    private final EventId createCaseApplicationEventId;

    private final EventId createCaseEventId;

    private final EventId paymentFailedEventId;

    private final EventId paymentFailedToSuccessEventId;

    private final EventId paymentFailedAgainEventId;

}
