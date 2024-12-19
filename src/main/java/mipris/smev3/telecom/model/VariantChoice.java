package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantChoice {

    @JsonProperty("KP_OA_01")
    private String kP_OA_01;

    @JsonProperty("KP_OA_02")
    private String kP_OA_02;

    public VariantChoice() {
    }

    public VariantChoice(String kP_OA_01, String kP_OA_02) {
        this.kP_OA_01 = kP_OA_01;
        this.kP_OA_02 = kP_OA_02;
    }

    public String getkP_OA_01() {
        return kP_OA_01;
    }

    public void setkP_OA_01(String kP_OA_01) {
        this.kP_OA_01 = kP_OA_01;
    }

    public String getkP_OA_02() {
        return kP_OA_02;
    }

    public void setkP_OA_02(String kP_OA_02) {
        this.kP_OA_02 = kP_OA_02;
    }
}
