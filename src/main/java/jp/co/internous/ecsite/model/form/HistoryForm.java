package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable {
	private int userId;
	
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}

}
