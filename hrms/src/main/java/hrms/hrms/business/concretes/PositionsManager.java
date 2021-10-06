package hrms.hrms.business.concretes;

import hrms.hrms.business.abstracts.PositionsService;
import hrms.hrms.dataAccess.abstracts.PositionsDao;
import hrms.hrms.entities.concretes.Positions;

import java.util.List;

public class PositionsManager implements PositionsService {

    private PositionsDao positionsDao;
    public PositionsManager(PositionsDao positionsDao) {
        this.positionsDao = positionsDao;
    }

    @Override
    public List<Positions> getAll() {
        return this.positionsDao.findAll();
    }
}
