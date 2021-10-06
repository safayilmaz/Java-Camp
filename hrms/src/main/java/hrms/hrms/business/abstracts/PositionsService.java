package hrms.hrms.business.abstracts;

import hrms.hrms.entities.concretes.Positions;

import java.util.List;

public interface PositionsService {

    List<Positions> getAll();
}
