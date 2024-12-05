package com.rk.FlatController;

import com.rk.FlatEntity.*;
import com.rk.FlatService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flats")
public class FlatController {

    @Autowired
    private FlatService flatService;

    @PostMapping("/add")
    public Flat addFlat(@RequestBody Flat flat)
    {
        return flatService.addFlat(flat);
    }

    @PutMapping("/update")
    public Flat updateFlat(@RequestBody Flat flat)
    {
        return flatService.updateFlat(flat);
    }

    @GetMapping("/{id}")
    public Flat getFlatById(@PathVariable int id)
    {
        return flatService.getFlatById(id);
    }

    @GetMapping("/all")
    public List<Flat> getAllFlats()
    {
        return flatService.getAllFlats();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFlat(@PathVariable int id)
    {
        flatService.deleteFlat(id);
        return "Flat with ID " + id + " deleted successfully!";
    }

    @GetMapping("/availability/{status}")
    public List<Flat> getFlatsByAvailability(@PathVariable boolean status)
    {
        return flatService.getFlatsByAvailability(status);
    }

    @GetMapping("/furnished/{status}")
    public List<Flat> getFlatsByFurnishedStatus(@PathVariable String status)
    {
        return flatService.getFlatsByFurnishedStatus(status);
    }

    @GetMapping("/price-range")
    public List<Flat> getFlatsByPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice)
    {
        return flatService.getFlatsByPriceRange(minPrice, maxPrice);
    }
}

