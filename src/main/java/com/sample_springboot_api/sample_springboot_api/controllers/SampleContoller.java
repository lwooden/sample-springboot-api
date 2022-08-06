package com.sample_springboot_api.sample_springboot_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.POJONode;
import com.sample_springboot_api.sample_springboot_api.models.*;

@RestController
public class SampleContoller {

    @GetMapping("/health")
    public String healthCheck() {
        return "SpringBoot service is healthy!";

    }

    @ResponseBody // tells handler to deserialize response into JSON
    @GetMapping("/echo")
    // Define a custom response object -> CustomResponse
    // Parse a query string passed in the request URL -> @RequestParam
    public CustomResponse getEcho(@RequestParam String term) {
        // Perform string interpolation to return the query string that I parsed in a
        // response
        return new CustomResponse(String.format("You said: %s", term));

    }

    @ResponseBody
    @GetMapping("/env")
    public EnvironmentCheckResponse checkEnvironment() {

        String classification = System.getenv("ENV");
        EnvironmentCheckResponse response = new EnvironmentCheckResponse(
                String.format("It looks like you are running in a %s environment!", classification));
        return response;
    }

    @ResponseBody
    @PostMapping("/sum")
    // Define a custom response object -> SumResponse
    // Map the request body sent by the client to a Java Object -> SumResponse
    public SumResponse getSum(@RequestBody SumResponse values) {
        values.Sum();
        return values;

    }


    @GetMapping("/kubernetes")
    public PodMetadata getPodInfo() {

        String node = System.getenv("NODE_NAME");
        String pod = System.getenv("POD_NAME");
        String podIp = System.getenv("POD_IP");
        String podNamespace = System.getenv("POD_NAMESPACE");
        String podService = System.getenv("POD_SERVICE");

        PodMetadata podInfo = new PodMetadata(node, pod, podIp, podNamespace, podService);

        return podInfo;
    }

    @ResponseBody
    @GetMapping("/pokemon/{id}") // Parse a URL path parameter passed in the request URL -> @PathVariable
    public Pokemon fetchPokemon(@PathVariable String id) {

        String url = String.format("https://pokeapi.co/api/v2/pokemon/%s", id); // set dynamic url

        // RestTemplate handles ALL of the plumbing when it comes to calling external APIs in my handler
        // Simply reference the url and Java Object/Class that I want to deserialize/map to
        // and RestTemplate handles everything else!
        RestTemplate restTemplate = new RestTemplate();
        Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
        return pokemon;
    }
}
