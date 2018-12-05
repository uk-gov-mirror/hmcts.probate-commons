package uk.gov.hmcts.reform.probate.model.cases.grantofrepresentation;

import lombok.Data;
import lombok.Value;

import java.util.List;

@Value
@Data
public class LegalStatement {

    private final String intro;

    private final String applicant;

    private final String deceased;

    private final String deceasedOtherNames;

    private final String deceasedEstateValue;

    private final String deceasedEstateLand;

    private final List<LegalStatementExecutorsNotApplying> executorsNotApplying;

    private final List<LegalStatementExecutorsApplying> executorsApplying;

}