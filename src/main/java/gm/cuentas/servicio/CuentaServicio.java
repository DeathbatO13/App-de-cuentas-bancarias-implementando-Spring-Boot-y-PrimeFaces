package gm.cuentas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.cuentas.modelo.Cuenta;
import gm.cuentas.repositorio.CuentaRepositorio;

@Service
public class CuentaServicio implements ICuentaServicio{
	
	@Autowired
	private CuentaRepositorio cuentaRepositorio;
	
	@Override
	public List<Cuenta> listarCuentas() {
		// TODO Auto-generated method stub
		return cuentaRepositorio.findAll();
	}

	@Override
	public Cuenta buscarCuentaPorId(Integer idCuenta) {
		// TODO Auto-generated method stub
		Cuenta cuenta = cuentaRepositorio.findById(idCuenta).orElse(null);
		return cuenta;
	}

	@Override
	public void guardarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		cuentaRepositorio.save(cuenta);
	}

	@Override
	public void eliminarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		cuentaRepositorio.delete(cuenta);
	}

}
