package com.example.swaggertest;

import com.example.client.api.PetApi;
import com.example.client.api.PetApiTest;
import com.example.client.model.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PetApiTestImpl implements PetApiTest {
    private static PetApi petApi = new PetApi();

    @LocalServerPort
    public void setServerPort(int port) {
        petApi.getApiClient().setBasePath("http://localhost:"+port + "/v2");
    }

    @Override
    public void addPetTest() {

    }

    @Override
    public void deletePetTest() {

    }

    @Override
    public void findPetsByStatusTest() {

    }

    @Override
    public void findPetsByTagsTest() {

    }

    @Override
    @Test
    public void getPetByIdTest() {
        Pet response = petApi.getPetById(3L);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(3L, response.getId());
    }

    @Override
    public void updatePetTest() {

    }

    @Override
    public void updatePetWithFormTest() {

    }

    @Override
    public void uploadFileTest() {

    }
}
