package com.example.schoolmanagementsystem.dto;

import com.example.schoolmanagementsystem.enums.StudentClass;
import com.example.schoolmanagementsystem.enums.Terms;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {

    private String studentName;

    private String subjectName;

    private String terms;

    private String studentClass;

    private Integer mathematics;

    private Integer english;

    private Integer writing;

    private Integer drawing;

    private Integer geography;

    private Integer physics;

    private Integer chemistry;

    private Integer music;

    private Integer painting;

    private Integer biology;

    private Integer economics;

    private Integer art;

    private Integer generalScience;

    private Integer accounting;
}
