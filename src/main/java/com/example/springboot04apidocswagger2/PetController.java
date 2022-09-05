package com.example.springboot04apidocswagger2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "Benim Pet API dökümantasyonum")

public class PetController {
    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1,"Test Pet",new Date()));
    }

    @PostMapping
    @ApiOperation(value = "New Pet add method", notes = "use this method correctly")
    public ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "Animal") Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }
    @GetMapping(value = "")
    @ApiOperation(value = "pet list method", notes = "this method returns all")
    public ResponseEntity<List<Pet>> listAll(){
        return ResponseEntity.ok(petList);
    }
}
