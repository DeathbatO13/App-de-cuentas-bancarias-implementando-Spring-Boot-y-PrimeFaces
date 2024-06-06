package gm.cuentas.servicio;

import java.util.List;

import gm.cuentas.modelo.*;

public interface ICuentaServicio{
	public List<Cuenta> listarCuentas();
	
	public Cuenta buscarCuentaPorId(Integer idCuenta);
	public void guardarCuenta(Cuenta cuenta);
	public void eliminarCuenta(Cuenta cuenta);

}
