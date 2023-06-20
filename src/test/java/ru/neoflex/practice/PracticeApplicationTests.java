package ru.neoflex.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class PracticeApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void TestForPlus() throws Exception
	{
		this.mockMvc
				.perform(get("/plus/10/9"))
				.andDo(print())
				.andExpect(content().string(containsString("19")));
	}

	@Test
	public void TestForMinus() throws Exception
	{
		this.mockMvc
				.perform(get("/minus/17/2"))
				.andDo(print())
				.andExpect(content().string(containsString("15")));
	}

	@Test
	public void TestForMultiply() throws Exception
	{
		this.mockMvc
				.perform(get("/multiply/20/4"))
				.andDo(print())
				.andExpect(content().string(containsString("80")));
	}

	@Test
	public void TestForDivide() throws Exception
	{
		this.mockMvc
				.perform(get("/divide/12/3"))
				.andDo(print())
				.andExpect(content().string(containsString("4")));
	}
}
