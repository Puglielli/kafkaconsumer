package br.com.projetoitau.kafkaconsumer.repository;

import br.com.projetoitau.kafkaconsumer.model.HistoricoVO;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface HistoricoRepository extends CrudRepository<HistoricoVO, String> {

    @Query(value = "select * from historico where id = (:id) ALLOW FILTERING")
    List<HistoricoVO> getHistoricoById(@Param("id") UUID id);
}
