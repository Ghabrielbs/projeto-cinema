package com.projetocinema.repository.sessao;

import com.projetocinema.domain.filme.Filme;
import com.projetocinema.domain.sessao.Sessao;
import com.projetocinema.exception.RequisicaoApiExpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SessaoRepository {
    private final SessaoRowMapper sessaoRowMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public SessaoRepository(SessaoRowMapper sessaoRowmapper){
        this.sessaoRowMapper = sessaoRowmapper;
    }
    public List<Sessao> listar(){

        String sql = "SELECT * FROM sessaodofilme ";
        List<Sessao>  resultado = null;

        try {
            resultado = jdbcTemplate.query(sql,sessaoRowMapper);
        }catch (RequisicaoApiExpetion expetion){
            expetion.getMessage();
        }

        return resultado;
    }

    public Sessao buscar(String id){

        String sql= "select * from sessaodofilme where id = ?";
        Sessao resultado = null;

        try{ resultado = jdbcTemplate.queryForObject(sql,sessaoRowMapper,id);
        }
        catch (RequisicaoApiExpetion expetion){
            expetion.getMessage();
        }

        return resultado;
    }

    public void criar(Sessao sessao){
        String sql = "insert into sessaodofilme (id,saladecinema,filme) values (?,?,?)";

        try {
            jdbcTemplate.update(sql, sessao.getId(),sessao.getIdSala(),sessao.getIdFilme());
        }catch (RequisicaoApiExpetion expetion){
            expetion.getMessage();
        }
    }

    public void atualizar(Sessao sessao){

        jdbcTemplate.update("update sessaodofilme set saladecinema =?, filme =? where id =?",
                sessao.getIdSala(),sessao.getIdFilme(),sessao.getId());
    }

    public void deletar( Sessao sessao) {
        jdbcTemplate.update("delete from sessaodofilme where id =?", sessao.getId());
    }
}

