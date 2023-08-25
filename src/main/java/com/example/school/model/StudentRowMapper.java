/*
 * You can use the following import statements
 *
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * import org.springframework.jdbc.core.RowMapper;
 *
 */

package com.example.school.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.school.model.RomMapper;
import org.springframework.jdbc.core.RowMapper;

public class StudentRomMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs,int rowNum) throws SQLException {
        return new Student(
                rs.getInt("studentId"),
                rs.getString("studentName"),
                rs.getString("gender"),
                rs.getInt("standard")
        );
    }

	@Override
	public Student mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}