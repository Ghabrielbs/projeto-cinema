package com.projetocinema.repository.sala;

import com.projetocinema.domain.sala.SalaDeExibicao;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SalaRowMapper implements RowMapper<SalaDeExibicao>{
    @Override
    public SalaDeExibicao mapRow(ResultSet rs, int rownum) throws SQLException {
        SalaDeExibicao sala = new SalaDeExibicao();
        sala.setIdSala(rs.getString("id"));
        sala.setNumero(rs.getInt("numero"));

        return sala;
    }
}
