package io.tgsinc.tgsgngec.domain.admin.search;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResearchSearch {

    private String rsrchYr;

    private String searchType;

    private String keyword;
}
