package br.com.portifolio.dao;

import br.com.portifolio.domain.Skills;
import java.util.List;

public interface skillsDAO {

    void save(Skills skill);

    void delete(Skills skill);

    List<Skills> find();

}
