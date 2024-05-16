package io.tgsinc.tgsgngec.global.common.dto.file;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FileInfoDTO {

    /**
     * 파일 그룹 idx
     */
    private Long idx;

}
