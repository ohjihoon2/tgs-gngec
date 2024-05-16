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
@Table(name = "file_group")
public class FileGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILE_GROUP_IDX")
    @Comment("파일 그룹 IDX")
    private Long idx;

    @OneToMany(mappedBy = "fileGroup")
    List<FileInfo> fileInfoList = new ArrayList<>();


}
