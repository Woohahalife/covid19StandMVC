package com.example.covid19standmvc.dto;

import com.example.covid19standmvc.constant.ErrorCode;
import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class APIErrorResponse {

    private final boolean sueecss;
    private final Integer errorCode;
    private final String message;

    public static APIErrorResponse of(
            boolean sueecss, Integer errorCode, String message)
    {
        return new APIErrorResponse(sueecss, errorCode, message);
    }

    public static APIErrorResponse of(
            boolean sueecss, ErrorCode errorCode)
    {
        return new APIErrorResponse(sueecss, errorCode.getCode(), errorCode.getMessage());
    }

    public static APIErrorResponse of(
            boolean sueecss, ErrorCode errorCode, Exception e)
    {
        return new APIErrorResponse(sueecss, errorCode.getCode(), errorCode.getMessage(e));
    }

    public static APIErrorResponse of(
            boolean sueecss, ErrorCode errorCode, String message)
    {
        return new APIErrorResponse(sueecss, errorCode.getCode(), errorCode.getMessage(message));
    }

}
