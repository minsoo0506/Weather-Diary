package zerobase.weather;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {
	@Test
	@DisplayName("값이 같은지 확인하는 테스트")
	void equalTest(){
	    //given
	    //when
	    //then
		assertEquals(1, 1);
	}

	@Test
	@DisplayName("null인지 확인하는 테스트")
	void nullTest(){
	    //given
	    //when
	    //then
		assertNull(null);
	}

	@Test
	@DisplayName("true인지 확인하는 테스트")
	void trueTest(){
	    //given
	    //when
	    //then
		assertTrue(1==1);
	}
}
