package uk.gov.hmcts.reform.probate.model.forms.pa;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Executor {

    private String fullName;

    private String lastName;

    private String firstName;

    private Boolean isApplying;

    private Boolean hasOtherName;

    private String currentName;

    private String currentNameReason;

    private String email;

    private String mobile;

    private String address;

    private String freeTextAddress;

    private String inviteId;

    private Boolean emailSent;

    private String notApplyingReason;

    private String notApplyingKey;

    private String otherReason;

}
