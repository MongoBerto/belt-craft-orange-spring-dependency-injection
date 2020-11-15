package belt.craft.orange.springscopedependencyinjection.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class ScopeDependencyInjectionIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldInjectOneProxifiedRequestBeanPerHttpRequest() throws Exception {

        assertThat(mockMvc.perform(get("/proxified-request-bean")).andReturn().getResponse().getContentAsString()).isEqualTo("1");

        assertThat(mockMvc.perform(get("/proxified-request-bean")).andReturn().getResponse().getContentAsString()).isEqualTo("2");
    }

    @Test
    void shouldInjectOnlyOneNoProxifiedRequestBeanOnApplicationBeanInstanciation() throws Exception {

        assertThat(mockMvc.perform(get("/no-proxified-request-bean")).andReturn().getResponse().getContentAsString()).isEqualTo("1");

        assertThat(mockMvc.perform(get("/no-proxified-request-bean")).andReturn().getResponse().getContentAsString()).isEqualTo("1");
    }
}
