package com.algonquin.loggy;
import java.util.UUID;

public class Recording {

	private UUID ID;
	private long size;
	private String name;
	private String ccfile;
	
	public Recording(UUID ID, String name, long size) {
		this.ID = ID;
		this.size = size;
		this.name = name;
	}

	public UUID getID() {
		return ID;
	}
	
	public void setID(UUID iD) {
		ID = iD;
	}
	
	public long getSize() {
		return size;
	}
	
	public void setSize(long size) {
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCcfile() {
		return ccfile;
	}

	public void setCcfile(String ccfile) {
		this.ccfile = ccfile;
	}

}