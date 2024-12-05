package com.rk.FlatService;

import com.rk.FlatEntity.*;
import com.rk.FlatDao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatService {

    @Autowired
    private FlatDao flatDAO;

    public Flat addFlat(Flat flat)
    {
        return flatDAO.addFlat(flat);
    }

    public Flat updateFlat(Flat flat)
    {
        return flatDAO.updateFlat(flat);
    }

    public Flat getFlatById(int id)
    {
        return flatDAO.getFlatById(id);
    }

    public List<Flat> getAllFlats()
    {
        return flatDAO.getAllFlats();
    }

    public void deleteFlat(int id)
    {
        flatDAO.deleteFlat(id);
    }

    public List<Flat> getFlatsByAvailability(boolean isAvailable)
    {
        return flatDAO.getFlatsByAvailability(isAvailable);
    }

    public List<Flat> getFlatsByFurnishedStatus(String furnishedStatus)
    {
        return flatDAO.getFlatsByFurnishedStatus(furnishedStatus);
    }

    public List<Flat> getFlatsByPriceRange(double minPrice, double maxPrice)
    {
        return flatDAO.getFlatsByPriceRange(minPrice, maxPrice);
    }
}

