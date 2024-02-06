package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

  @GetMapping("/grades")
  public String getGrade(Model model){
    Grade grade = new Grade("Harry", "Potions", "A+");
    model.addAttribute("grades", grade);
    return "grades";
  }
}
