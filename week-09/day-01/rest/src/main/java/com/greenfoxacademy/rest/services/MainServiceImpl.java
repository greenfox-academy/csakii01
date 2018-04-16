package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.AppendAResponse;
import com.greenfoxacademy.rest.models.DoubleResponse;
import com.greenfoxacademy.rest.models.GreeterResponse;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl {

  public Integer parseInt(String s) {
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  public DoubleResponse doubleInput(Integer input) {
    return new DoubleResponse(input);
  }

  public GreeterResponse greeterResponse(String name, String title) {
    return new GreeterResponse(name, title);
  }

  public AppendAResponse appendWithA(String s) {
    return new AppendAResponse(s);
  }
}
