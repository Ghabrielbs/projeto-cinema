package com.projetocinema.repository.filme;

import com.projetocinema.domain.filme.Filme;
import com.projetocinema.enums.FilmeMenssagens;
import com.projetocinema.exception.RequisicaoApiExpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmeRepository {
    private final FilmeRowMapper filmeRowMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public FilmeRepository(FilmeRowMapper filmeRowMapper) {
        this.filmeRowMapper = filmeRowMapper;
    }
    public List<Filme> listar(){
        String sql = "select * from filme";
        List<Filme> resultado = null;

        try {
            resultado = jdbcTemplate.query(sql, filmeRowMapper);
        } catch(RequisicaoApiExpetion expetion) {
            expetion.getMessage();
        }

        return resultado;
    }
    public Filme buscar(String id){
        String sql = "select * from filme where id = ?";
        Filme resultado = null;

        try {
            resultado = jdbcTemplate.queryForObject(sql,filmeRowMapper, id);
        }
        catch (RequisicaoApiExpetion expetion){
            expetion.getMessage();
        }

        return resultado;
    }

    public void criar(Filme filme){
        String sql = "insert into filme (id,nome, descricao) values (?,?,?)";

        try {
            jdbcTemplate.update(sql, filme.getId(),filme.getNome(),filme.getDescricao());
        }
        catch(RequisicaoApiExpetion expetion){
            expetion.getMessage();
        }
    }

    public void atualizar(Filme filme){
        jdbcTemplate.update("update filme set nome =?, descricao =? where id =?",
                filme.getNome(),filme.getDescricao(),filme.getId());
    }

    public void deletar( Filme filme) {
        jdbcTemplate.update("delete from filme where id =?", filme.getId());
    }

    public Integer findByCountId(String id){
        return jdbcTemplate.queryForObject("select count(*) from filme where id=?", Integer.class,id);
    }
}
