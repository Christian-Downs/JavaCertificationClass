package com.MavinProject.service.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
 
import com.MavinProject.testClasses.DatabaseDAO;
import com.MavinProject.testClasses.NetworkDAO;
import com.MavinProject.testClasses.RecordService;


public class MyServiceTest {
	
	@InjectMocks
	RecordService recordService;
	
	@Mock
	DatabaseDAO databaseMock;
	
	@Mock
	NetworkDAO networkMock;
	
	@Test
	public void saveTest() {
		boolean saved = recordService.save("temp.txt");
		assertEquals(true,saved);
		
		verify(databaseMock, times(1)).save("temp.txt");
		verify(networkMock, times(1)).save("temp.txt");
	}
}
