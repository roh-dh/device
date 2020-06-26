package home.beans.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

//우리가 만든 뷰(daily_count)를 저장하기 위한 DTO
public class DailyCountDto {
	private String day;
	private int cnt;
	public DailyCountDto() {
	}

	
	public DailyCountDto(ResultSet rs) throws SQLException {
		this.setCnt(rs.getInt("cnt"));
		this.setDay(rs.getString("day"));
	}
	
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}
}
