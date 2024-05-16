package io.tgsinc.tgsgngec.global.common.enums;

/**
 * RsrchFldEnum
 * @author ohjihoon
 * @version 1.0.0
 * @date 2024-05-16
 * @description 연구분야 및 세부연구분야
 */
public enum RsrchFldEnum {
    ENVIRONMENT("환경정책"), RESEARCH("조사연구"),DEVELOPMENT("현안기술개발"), COOPERATION("산학연협력연구");

    private String rsrchFld;

    // 생성자 (싱글톤)
    private RsrchFldEnum(String rsrchFld) {
        this.rsrchFld = rsrchFld;
    }

    // Getter
    public String getRsrchFld() {
        return rsrchFld;
    }
}
