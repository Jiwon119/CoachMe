package com.ssafy.api.coaching.dto.request;

import lombok.Data;

@Data
public class GetOneCoachingResponseDto {
  private String main;
  private String sub;
  private String name;
  private String summary;
  private String htmlDocs;
}
