package com.example.covid19standmvc.controller;

import com.example.covid19standmvc.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/places")
    public ModelAndView adminPlaces(
            @RequestParam(required = false) PlaceType placeType,
            @RequestParam(required = false) String placeName,
            @RequestParam(required = false) String address
    )
    {
        Map<String, Object> map = new HashMap<>();
        map.put("placeType", placeType);
        map.put("placeName", placeName);
        map.put("address", address);

        return new ModelAndView("admin/places", map);
    }

    @GetMapping("/places/{placeId}")
    public String adminPlacesDetail(@PathVariable Integer placeId) {
        return "admin/places-detail";
    }

    @GetMapping("/events")
    public String adminEvents() {
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEvents(@PathVariable Integer eventId) {
        return "admin/events-detail";
    }
}
