package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.Service.TrainingTypeService;
import peaksoft.dto.SimpleResponse;
import peaksoft.model.TrainingType;

@RestController
@RequestMapping("/types")
@RequiredArgsConstructor
public class TrainingTypeController {

    private final TrainingTypeService trainingTypeService;

    @PostMapping("/createType")
    public SimpleResponse save(@RequestBody TrainingType trainingType){
        return trainingTypeService.save(trainingType);
    }
}
