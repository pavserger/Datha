package controllers;

import lombok.Data;
import main.model.ParcelRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data



public class DachaController {

    private ParcelRepository parcelRepository;

    public DachaController(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }
}
