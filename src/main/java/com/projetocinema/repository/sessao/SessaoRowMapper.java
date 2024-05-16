package com.projetocinema.repository.sessao;

import com.projetocinema.domain.sessao.Sessao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@Component
public class SessaoRowMapper implements RowMapper<Sessao> {

    @Override
    public Sessao mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sessao sessao = new Sessao();
        sessao.setId(rs.getString("id"));
        sessao.setIdFilme(rs.getString("filme"));
        sessao.setIdSala((rs.getString("saladecinema")));

        return sessao;
    }
}
