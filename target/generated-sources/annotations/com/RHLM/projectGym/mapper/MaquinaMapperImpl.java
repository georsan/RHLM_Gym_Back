package com.RHLM.projectGym.mapper;

import com.RHLM.projectGym.dto.MaquinaDTO;
import com.RHLM.projectGym.model.Maquina;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-01T20:02:16-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Amazon.com Inc.)"
)
public class MaquinaMapperImpl implements MaquinaMapper {

    @Override
    public Maquina toMaquina(MaquinaDTO maquinaDTO) {
        if ( maquinaDTO == null ) {
            return null;
        }

        Maquina maquina = new Maquina();

        maquina.setId( maquinaDTO.getId() );
        maquina.setNombre( maquinaDTO.getNombre() );

        return maquina;
    }

    @Override
    public MaquinaDTO toMaquinaDTO(Maquina maquina) {
        if ( maquina == null ) {
            return null;
        }

        MaquinaDTO maquinaDTO = new MaquinaDTO();

        maquinaDTO.setId( maquina.getId() );
        maquinaDTO.setNombre( maquina.getNombre() );

        return maquinaDTO;
    }
}
