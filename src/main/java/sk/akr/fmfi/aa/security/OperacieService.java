package sk.akr.fmfi.aa.security;

import jakarta.ejb.Local;
import sk.akr.fmfi.aa.to.OperaciaTO;

@Local
public interface OperacieService {

    void vytvorOperaciu(OperaciaTO operaciaTO) throws Exception;
}
