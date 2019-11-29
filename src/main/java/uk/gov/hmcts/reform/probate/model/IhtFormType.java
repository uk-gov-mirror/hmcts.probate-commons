package uk.gov.hmcts.reform.probate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static uk.gov.hmcts.reform.probate.model.IhtFormType.Constants.IHT205_VALUE;
import static uk.gov.hmcts.reform.probate.model.IhtFormType.Constants.IHT207_VALUE;
import static uk.gov.hmcts.reform.probate.model.IhtFormType.Constants.IHT400421_VALUE;

@RequiredArgsConstructor
public enum IhtFormType {

    @JsonProperty(IHT205_VALUE) IHT205("optionIHT205"),
    @JsonProperty(IHT207_VALUE) IHT207("optionIHT207"),
    @JsonProperty(IHT400421_VALUE) IHT400421("optionIHT400421");

    @Getter
    private final String description;

    public static IhtFormType fromString(String text) {
        for (IhtFormType ihtFormType : IhtFormType.values()) {
            if (text != null && ihtFormType.description.equalsIgnoreCase(text)) {
                return ihtFormType;
            }
        }
        return null;
    }

    public static class Constants {

        public static final String IHT205_VALUE = "IHT205";

        public static final String IHT207_VALUE = "IHT207";

        public static final String IHT400421_VALUE = "IHT400421";


        private Constants() {
        }
    }
}
