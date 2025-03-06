package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NaverAPIResult(String lastBuildDate, List<NaverAPIResultItem> items) {
}

