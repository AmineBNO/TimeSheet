package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.ITimesheetService;

@SpringBootTest
public class TimeSheetTest {

	@Autowired
	ITimesheetService ts;
	
	@Test
	public void testAjouterMission() throws ParseException{
		Mission m = new Mission("test","desc");
		int missionAdded = ts.ajouterMission(m);
		assertEquals(5, missionAdded);
	}
}
