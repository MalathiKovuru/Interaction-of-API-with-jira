package demo;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Issue
 {
    public static void main(String[]args) throws UnirestException
    {
        HttpResponse<JsonNode> response = Unirest.get("https://kovurumalathi123.atlassian.net/rest/api/3/issue/AP-4")
  .basicAuth("kovurumalathi123@gmail.com", "ATATT3xFfGF0ThCWDQ69T7A5MoAPRwuLgjaaZdUMeP_8UMQ_24RKTbA9NRk3ceUziaA6OvAzB3QMpyNCrF85WSJMOC2n6iMvZu7H2F3xIQGiPSFx1kzPv7sUpKUF28rG3VaJhfZUaaQoB-CgYbuvKCyEqdqpJCNDV12KEGGjDeCjUhrEN5Pa4ys=138D4CA7")
  .header("Accept", "application/json")
  .asJson();

System.out.println(response.getBody());
    }
}
