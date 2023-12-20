package com.example.covid19standmvc.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api")
public class APIPlaceController {

    @GetMapping("/places")
    public List<String> getPlaces() {
        return List.of("place1, place2");
    }

    @PostMapping("/places")
    public boolean createplaces() {
        return true;
    }

    @GetMapping("/places/{placeId}")
    public String getplace(@PathVariable Integer placeId) {
        return "event" + placeId;
    }

    @PutMapping("/places/{placeId}")
    public boolean modifyplace(@PathVariable Integer placeId) {
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public boolean removeplace(@PathVariable Integer placeId) {
        return true;
    }


}
