package uk.gov.hmcts.reform.probate;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static uk.gov.hmcts.reform.probate.ProbateType.Constants.INTESTACY_NAME;
import static uk.gov.hmcts.reform.probate.ProbateType.Constants.PERSONAL_NAME;

@ApiModel(value = "ProbateType", description = "Represents probate type")
@RequiredArgsConstructor
public enum ProbateType {

    @JsonProperty(INTESTACY_NAME) INTESTACY(INTESTACY_NAME),
    @JsonProperty(PERSONAL_NAME) PERSONAL(PERSONAL_NAME);

    @Getter
    private final String name;

    public static class Constants {

        public static final String INTESTACY_NAME = "Intestacy";
        public static final String PERSONAL_NAME = "Personal";

        private Constants() {
        }
    }
}
