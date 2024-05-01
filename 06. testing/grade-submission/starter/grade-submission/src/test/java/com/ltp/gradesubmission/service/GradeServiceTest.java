package com.ltp.gradesubmission.service;

import com.ltp.gradesubmission.repository.GradeRepository;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class GradeServiceTest {

  @Mock
  private GradeRepository gradeRepository;

  @InjectMocks
  private GradeService gradeService;
}