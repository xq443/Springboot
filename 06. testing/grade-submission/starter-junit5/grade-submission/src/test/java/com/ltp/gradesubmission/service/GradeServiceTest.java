package com.ltp.gradesubmission.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ltp.gradesubmission.Constants;
import com.ltp.gradesubmission.pojo.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GradeServiceTest {

  @Mock
  private GradeRepository gradeRepository;

  @InjectMocks
  private GradeService gradeService;

  @Test
  public void getGradesTest() {
    when(gradeRepository.getGrades()).thenReturn(Arrays.asList(
        new Grade("Cathy", "Potions", "A+"),
        new Grade("Cathy", "Springboot", "A+")
    ));

    List<Grade> ret = gradeService.getGrades(); //act
    assertEquals("Cathy", ret.get(0).getName());
    assertEquals("Springboot", ret.get(1).getSubject());
  }

  @Test
  public void gradeIndexTest() {
    Grade grade = new Grade("Cathy", "Potions", "A+");
    when(gradeRepository.getGrades()).thenReturn(List.of(grade));
    when(gradeRepository.getGrade(0)).thenReturn(grade);

    int valid = gradeService.getGradeIndex(grade.getId());
    int notFound = gradeService.getGradeIndex("1234");

    assertEquals(0, valid);
    assertEquals(Constants.NOT_FOUND, notFound);
  }

  @Test
  public void returnGradeById() {
    Grade grade = new Grade("Cathy", "Potions", "A+");
    when(gradeRepository.getGrades()).thenReturn(List.of(grade));
    when(gradeRepository.getGrade(0)).thenReturn(grade);

    String id = grade.getId();
    Grade result = gradeService.getGradeById(id);
    assertEquals(grade, result);
  }

  @Test
  public void addGradeTest() {
    Grade grade = new Grade("Cathy", "Potions", "A+");
    when(gradeRepository.getGrades()).thenReturn(List.of(grade));
    when(gradeRepository.getGrade(0)).thenReturn(grade);

    Grade newGrade = new Grade("Harry", "Arithmancy", "B");
    gradeService.submitGrade(newGrade);

    // Verify that the addGrade is called exactly once with the newGrade object
    verify(gradeRepository, times(1)).addGrade(newGrade);
  }

  @Test
  public void updateGradeTest() {
    Grade grade = new Grade("Cathy", "Potions", "A+");
    when(gradeRepository.getGrades()).thenReturn(List.of(grade));
    when(gradeRepository.getGrade(0)).thenReturn(grade);

    grade.setScore("A");
    gradeService.submitGrade(grade);
    verify(gradeRepository, times(1)).updateGrade(grade, 0);
  }
}