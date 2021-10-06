package hrms.hrms.dataAccess.abstracts;

import hrms.hrms.entities.concretes.Positions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionsDao extends JpaRepository<Positions,Integer> {
    public void add(Positions position);
}
