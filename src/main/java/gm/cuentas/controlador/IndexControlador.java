package gm.cuentas.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gm.cuentas.modelo.Cuenta;
import gm.cuentas.servicio.CuentaServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.bean.ViewScoped;
import lombok.Data;


@SuppressWarnings("deprecation")
@Component
@Data
@ViewScoped
public class IndexControlador{
	@Autowired
	CuentaServicio cuentaServicio;
	private List<Cuenta> cuentas;
	
	private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);
	
	@PostConstruct
	public void init(){
		cargarDatos();
	}
	
	public void cargarDatos(){
		this.cuentas = cuentaServicio.listarCuentas();
		cuentas.forEach((cuenta) -> logger.info(cuenta.toString()));
	}
}
