package uk.gov.hmcts.reform.probate.model.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProbateCaseDetails {

    @Valid
    private CaseData caseData;

    private CaseInfo caseInfo;
}
