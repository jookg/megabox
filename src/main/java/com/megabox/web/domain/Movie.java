package com.megabox.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Lazy @Component @Data
public class Movie {
	private String movieSeq, movieTitle,director,actor,gnere,filmRate,contents,startDay,endDay,runningTimme,score,image;
}
