package com.example.lit.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class ProjectVO {
    private Long projectNumber;
    private String title;
    private String category;
    private String content;
    private String authentication;
    private String startDate;
    private String endDate;
    private Long status;

    private ProjectFileVO projectFileList;

}
