package com.example.swaggertest;


import com.example.swaggertest.api.PetApi;
import com.example.swaggertest.model.ModelApiResponse;
import com.example.swaggertest.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class PetApiImpl implements PetApi {

    @Override
    public ResponseEntity<Void> addPet(@Valid Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Valid List<String> status) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @Valid List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        Pet pet = new Pet();
        pet.setId(3L);
        pet.setName("Labby");
        return ResponseEntity.ok(pet);
    }

    @Override
    public ResponseEntity<Void> updatePet(@Valid Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, @Valid MultipartFile file) {
        return null;
    }
}
