package com.projetocinema.repository.sessao;

import com.projetocinema.domain.filme.Filme;
import com.projetocinema.domain.sessao.Sessao;
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
        }catch (Exception e){
            e.printStackTrace();
        }

        return resultado;
    }

    public Sessao buscar(String id){
        String sql= "select * from sessaodofilme where id = ?";
        Sessao resultado = null;

        try{ resultado = jdbcTemplate.queryForObject(sql,sessaoRowMapper,id);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return resultado;
    }

    public void criar(Sessao sessao){
        String sql = "insert into sessaodofilme (id,saladecinema,Filme) value (?, ?, ?)";

        try {
            jdbcTemplate.update(sessao.getIdSala(), sessao.getIdFilme(), sessao.getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

