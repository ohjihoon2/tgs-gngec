package io.tgsinc.tgsgngec.global.common.entity.file;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "file_info")
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILE_INFO_IDX")
    @Comment("파일 정보 IDX")
    private Long idx;

    @OneToMany(mappedBy = "files")
    List<Files> filesList = new ArrayList<>();


}
