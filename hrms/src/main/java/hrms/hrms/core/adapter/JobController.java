package hrms.hrms.core.adapter;

import hrms.hrms.dataAccess.abstracts.PositionsDao;
import hrms.hrms.entities.concretes.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class JobController {

    private PositionsDao positionsDao;

    @Autowired
    public JobController(PositionsDao positionsDao) {
        this.positionsDao = positionsDao;
    }

    @GetMapping("/getall")
    public List<Positions> getAll(){
        return this.positionsDao.findAll();
    }

}
