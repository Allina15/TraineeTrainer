package peaksoft.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import peaksoft.REpository.TrainingTypeRepository;
import peaksoft.Service.TrainingTypeService;
import peaksoft.dto.SimpleResponse;
import peaksoft.model.TrainingType;

@Service
public class TrainingTypeServiceImpl implements TrainingTypeService {

    @Autowired
    public TrainingTypeRepository trainingTypeRepository;


    @Override
    public SimpleResponse save(TrainingType trainingType) {
        trainingTypeRepository.save(trainingType);
        return new SimpleResponse(HttpStatus.OK,
                          "training type saved");
    }
}
