package com.frog.service;

import java.util.List;

import com.frog.model.FrogActivityEvent;
import com.frog.model.FrogTask;
import com.frog.model.TaskAward;

public interface FrogActivityEventService {
	List<FrogActivityEvent> getAllEvents();

	TaskAward getAwardByEventId(Integer eventId);

	FrogActivityEvent getEventById(Integer id);

	int addEvent(String eventname,String diff,String theme,String event_ref,String additional,String event_wire,Double event_price,String address,String event_pic);

	List<FrogActivityEvent> getEventByDiff(Integer diff);

	List<FrogActivityEvent> getEventByDiffTheme(Integer diff, Integer theme);
	
	int addEventPic(FrogActivityEvent event);
	
	List<FrogActivityEvent> getEvents(FrogActivityEvent event);
}
