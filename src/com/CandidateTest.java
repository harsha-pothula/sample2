package com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CandidateTest {

	@Test
	public void testGetNameLength() {
		Candidate obj=new Candidate();
		int actual=obj.getNameLength("Harsha");
		int expected=5;
		Assert.assertEquals(expected, actual);
	}

}
