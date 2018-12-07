package uk.gov.hmcts.reform.probate.model.cases;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@ApiModel(value = "Address", description = "Represents address in CCD")
public class Address implements Serializable {

    @NotNull
    @JsonProperty(value = "AddressLine1")
    private String addressLine1;

    @JsonProperty(value = "AddressLine2")
    private String addressLine2;

    @JsonProperty(value = "AddressLine3")
    private String addressLine3;

    @JsonProperty(value = "County")
    private String county;

    @JsonProperty(value = "PostTown")
    private String postTown;

    @NotNull
    @JsonProperty(value = "PostCode")
    private String postCode;

    @JsonProperty(value = "Country")
    private String country;
}
