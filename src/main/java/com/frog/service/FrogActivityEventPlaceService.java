package com.frog.service;

import java.util.List;

import com.frog.model.FrogActivityEventPlace;
import com.frog.model.FrogTask;

public interface FrogActivityEventPlaceService {
	public List<FrogTask> getAllFrogTasksByEventId(Integer id);
	Integer addEventPlace(FrogActivityEventPlace place);
}
