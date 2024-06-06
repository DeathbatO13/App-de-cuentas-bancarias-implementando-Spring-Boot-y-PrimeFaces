package gm.cuentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.cuentas.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer>{

}
