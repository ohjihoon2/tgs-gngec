package io.tgsinc.tgsgngec.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ErrorCode를 담을 class
 */
@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException{
    CustomErrorCode errorCode;
}
