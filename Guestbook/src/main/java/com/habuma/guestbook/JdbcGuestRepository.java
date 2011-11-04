package com.habuma.guestbook;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JdbcGuestRepository implements GuestRepository {

	private final JdbcTemplate jdbcTemplate;

	@Inject
	public JdbcGuestRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Transactional
	public void addGuest(Guest guest) {
		jdbcTemplate.update(
				"insert into Guest (name, email, dateOfVisit) values (?, ?, ?)", 
				guest.getName(), guest.getEmail(), guest.getDateOfVisit());
	}
	
	public List<Guest> getAllGuests() {
		return jdbcTemplate.query("select name, email, dateOfVisit from Guest order by dateOfVisit", new RowMapper<Guest>() {
			public Guest mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Guest(rs.getString("name"), rs.getString("email"), rs.getTimestamp("dateOfVisit"));
			}
		});
	}

}
