package peaksoft.REpository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import peaksoft.model.Training;

public interface TrainingRepository extends JpaRepository<Training,Long> {

    void deleteTrainingByTrainee_User_UserName(@Param("userName") String userName);
}
