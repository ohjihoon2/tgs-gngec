package io.tgsinc.tgsgngec.controller.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 상황에서 쓰일 Error Code
 */
@Getter
@AllArgsConstructor
public enum CustomErrorCode {
    /* 400 BAD_REQUEST : 잘못된 요청 */
    /* 401 UNAUTHORIZED : 인증되지 않은 사용자 */
    INVALID_AUTH_TOKEN(HttpStatus.UNAUTHORIZED, "권한 정보가 없는 토큰입니다."),

    /* 500 INTERNAL_SERVER_ERROR :  서버 에러 */
    FAILED_TO_SAVE_FILE(HttpStatus.INTERNAL_SERVER_ERROR, "파일 저장에 실패했습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;
}
