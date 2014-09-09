package com.ilegs.lecture.model;

import com.ilegs.core.model.IIdentity;

public interface ILecture {
	public IIdentity getIdentity();
	public void setIdentity(IIdentity identity);
	
	public String lectureName();
	public void setLectureName(String lectureName);
	
	public String lectureDescription();
	public void setLectureDescription(String lectureDescription);
}
