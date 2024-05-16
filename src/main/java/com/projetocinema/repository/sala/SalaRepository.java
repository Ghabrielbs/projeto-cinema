package com.projetocinema.repository.sala;

import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.exception.RequisicaoApiExpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SalaRepository {
    private final SalaRowMapper salaRowMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public SalaRepository(SalaRowMapper salaRowMapper){
        this.salaRowMapper = salaRowMapper;
    }
    public List<SalaDeExibicao> listar (){
        String sql = "SELECT * FROM saladeexibicao";
        List<SalaDeExibicao>  resultado = null;

        try {
            resultado = jdbcTemplate.query(sql, salaRowMapper);
        }catch(RequisicaoApiExpetion expetion) {
            expetion.getMessage();
        }

        return resultado;
    }
    public SalaDeExibicao buscar (String id) {
        String sql = "SELECT * FROM saladeexibicao WHERE id = ?";
        SalaDeExibicao resultado = null;

        try {
            resultado = jdbcTemplate.queryForObject(sql, salaRowMapper,id);
        }catch(RequisicaoApiExpetion expetion) {
            expetion.getMessage();
        }

        return resultado;
    }

    public void criar(SalaDeExibicao salaDeExibicao) {
        String sql = "INSERT INTO saladeexibicao(id,numero) VALUES (?, ?)";

        try {
            jdbcTemplate.update(sql, salaDeExibicao.getIdSala(),
                    salaDeExibicao.getNumero());
        } catch (RequisicaoApiExpetion expetion) {
            expetion.getMessage();
        }
    }

    public void atualizar(SalaDeExibicao salaDeExibicao){
        jdbcTemplate.update("update saladeexibicao set numero =? where id =?",
                salaDeExibicao.getNumero(),salaDeExibicao.getIdSala());
    }

    public void deletar( SalaDeExibicao salaDeExibicao) {
        jdbcTemplate.update("delete from saladeexibicao where id =?", salaDeExibicao.getIdSala());
    }
}


