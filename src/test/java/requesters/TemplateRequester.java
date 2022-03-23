package requesters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class TemplateRequester {
    private final String URL = "http://...";

    public void requestSomething() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForEntity(URL, String.class).getBody();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(json, Object.class);
    }
}
