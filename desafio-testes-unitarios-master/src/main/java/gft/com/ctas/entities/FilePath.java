package gft.com.ctas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.FILE_PATH")
public class FilePath implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FILE_PATH_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FILE_PATH_ID_GENERATOR")
	private long id;

	private String nombre;

	@Column(name="NOMBRE_COMPLETO")
	private String nombreCompleto;

	@Column(name="\"PATH\"")
	private String path;

	private String tipo;

	
}