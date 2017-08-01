package com.mfmc.service.controller.acesso;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class AcessoControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() {
    mockMvc = webAppContextSetup(webApplicationContext).build();
  }

//  @Test
  public void consultarUsuario() throws Exception {
    //given
    MockHttpServletRequestBuilder get = get("/acesso/consultar").param("email", "teste").contentType(MediaType.APPLICATION_FORM_URLENCODED);

    //when
    ResultActions result = mockMvc.perform(get).andDo(print());

    //then
    result.andExpect(status().isOk());
  }

  @Test
  public void createUser() throws Exception {
    //given
    MockHttpServletRequestBuilder post = post("/acesso/criar").param("email", "folprates@hotmail.com").param("primeironome", "Fernando").param("ultimonome", "Prates").param("datanascimento", "03/05/1993");

    //when
    ResultActions result = mockMvc.perform(post).andDo(print());

    //then
    result.andExpect(status().isCreated());
  }

}
