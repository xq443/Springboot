package com.ltp.gradesubmission.service;

import com.ltp.gradesubmission.Constants;
import com.ltp.gradesubmission.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;
import java.util.List;

public class GradeService {
  GradeRepository gradeRepository = new GradeRepository();

  public Grade getGrade(int index) {
    return gradeRepository.getGrade(index);
  }

  public void addGrade(Grade grade) {
    gradeRepository.addGrade(grade);
  }

  public void updateGrade(Grade grade, int index) {
    gradeRepository.updateGrade(grade, index);
  }

  public List<Grade> getGrades() {
    return gradeRepository.getGrades();
  }

  public int getGradeIndex(String id) {
    for (int i = 0; i < this.getGrades().size(); i++) {
      if (this.getGrades().get(i).getId().equals(id)) return i;
    }
    return Constants.NOT_FOUND;
  }

  public Grade getGradeById(String id) {
    int index = this.getGradeIndex(id);
    return index == Constants.NOT_FOUND ? new Grade() : this.getGrade(index);
  }

  public void submitGrade(Grade grade) {
    int index = this.getGradeIndex(grade.getId());
    if (index == Constants.NOT_FOUND) {
      this.addGrade(grade);
    } else {
      this.updateGrade(grade, index);
    }
  }
}
