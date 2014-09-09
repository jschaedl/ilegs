package com.ilegs.lecture.model.impl;

import com.ilegs.core.model.IIdentity;
import com.ilegs.lecture.model.ILecture;

public class LectureImpl implements ILecture {

	private IIdentity identity;
	private String lectureName;
	private String lectureDescription;
	
	@Override
	public IIdentity getIdentity() {
		return this.identity;
	}

	@Override
	public void setIdentity(IIdentity identity) {
		this.identity = identity;
	}

	@Override
	public String lectureName() {
		return this.lectureName;
	}

	@Override
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	@Override
	public String lectureDescription() {
		return this.lectureDescription;
	}

	@Override
	public void setLectureDescription(String lectureDescription) {
		this.lectureDescription = lectureDescription;
	}
	
}
